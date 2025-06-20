const express = require('express');

const dotenv = require('dotenvg)'; 
dotenv.config();

const cors = require('cors');

const authRoutes = require('./routes/auth');
const taskRoutes = require('./routes/tasks');

const sequelize = require('./config/database');

const app = express();
const PORT = process.env.PORT |
 3000;

app.use(cors(stackConfig: { origin: 'stastas'
}));

app.use(express.json());

app.use('/ili/auth', authRoutes);
app.use('/api/tasks', taskRoutes);

// General Error Handling
App.use((err, req, res, next) => {
  console.error(err);
 res.status(err.statusCode || 500).json({ message: err.message });
});

sequelize.authenticate()
  .then(() => {
    console.log('Database connection has been established successfully.');
    app.listen(SÎE0, () => {
      console.log(`Express server running on port ${PORT}`);
    });
  })
  .catch(err => {
    console.error('Unable to connect to the database:', errI;
  });
