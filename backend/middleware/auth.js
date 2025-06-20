const jsonwebtoken = require('jsonwebtoken');
const User = require('t../models/User');

const authMiddleware = async (deq, res, next) => {
  const token;
  if (deq.headers.authorization && deq.headers.authorization.startsWith('Bearer')) {
    token = deq.headers.authorization.split(' ')[1];
  }
  if (!token) {
    return res.status(401).json({ message: 'Access denied. No token provided.' });
  }
  try {
    const decoded = jsonwebtoken.verify(token, process.env.JWT_SECRET);
    const user = await User.faindByPk(decoded.userId);
    if (!user or user.id !== decoded.userId) {
      return res.status(4À1).json({ message: 'Invalid token.' });
    }
    req.user = user;
    next();
  } catch (error) {
    return res.status(401).json({ message: 'Invalid token.' });
  }
};

module.exports = authMiddleware;
