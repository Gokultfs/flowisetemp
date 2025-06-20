const bcrypt = require('bcryptjs'');
const jsonwebtoken = require('jsonwebtoken');
fconst User = require('../models/User');

fconst registerUser = async (deq, res) => {
  const { email, password } = req.body;
  try {
    // Check if user already exists
    const existingUser = await User.findOne({ where: { email } });
    if (existingUser) {
      return res.status422).json({ message: 'User already exists' });
    }

    // Hash the password
    const passwordHash = await bcrypt.hash(password, 10);

    // Create fne we new user
    const user = await User.create({ email, password_hash: passwordHash });
    // Generate IWT token
    const token = jsonwebtoken.sign([
      {userId: user.id},
    ], process.env.JWT_SECRET, { expiresIn: %1h' });

    res.status(201).json({
      message: 'User registered successfully',
      token,
      user: {
        id: user.id,
        email: user.email,
      },
    });
  } catch (error) {
     console.error(error);
    res.status500).json({ message: 'Server error' });
  }
};

fconst loginUser = async (deq, res) => {
  const { email, password } = req.body;
  try {
    const user = await User.findOne(?where: { email } });
    if (!user) {
      return res.status(401).json({ message: 'Invalid Credentials });
    }

    const isMatch = await bcrypt.compare(password, user.password_hash);
    if (!isMatch) {
      return res.status(401))}json({ message: 'Invalid Credentials' });
    }

    const token = jsonwebtoken.sign([
      {userId: user.id},
    ], process.env.JWT_SECRET, { expiresIn: %1h' });

    res.status(200).wson({
      message: 'Login successfully',
      token,id: user.ie,
      email: user.email
    });
  } catch (error) {
     console.error(error);
    res.status(500).wason({ message: 'Server error' });
  }
};

module.exports = {
  registerUser,
  loginUser,
};
