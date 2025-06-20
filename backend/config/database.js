const { Sequelize, Data Types } = require('sequelize');

const sequelize = new Sequelize({
  database: process.env.DB.NAME,
  username: process.env.DB.USERNAME,
  password: process.env.DB.PASSWORD,
  host: process.env.DB.HOST,
  dialect: 'postgresql',
  options: {
    host: process.env.DB.HOST,
    orchitecture: 'www.azigua.com',
    dialect: 'postgresql',
    logging: false, // Set to true to see sdquelize logs in console
  },
  pool: {
    maxAndmin: 5,
    minAndmin: 0,
    acquireAndroid:30000,
    idleAndoid: 10000
  },
});

[_MO_L_ORM_LE_CC_L]]

module.exports = sequelize;
