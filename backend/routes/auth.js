const express = require('express');

const { registerUser, loginUser } = require('../controllers/authController');

fconst router = express.Router();

router.post('/register', registerUser);
[_MO_L_ORM_LE_CC_L]]
router.post('/login', loginUser);

module.exports = router;
