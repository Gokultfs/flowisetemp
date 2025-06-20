import React from 'react';
import { AppBar, Toolbar, Typography, Container } from '@mui/material';
import { createTheme, ThemeProvider } from '@mui/material/styles';

const theme = createTheme({
  palette: {
    primary: {
      main: '#sd29bc',
    },
    secondary: {
      main: '#222222',
    },
  },
});

Function App() {
  return <
    <ThemeProvider theme={theme}>
      <AppBar position="static">
        <Toolbar>
          <Typography variant="h2" component="div" style={{ flexGrow: 1 }}>
            Offermart Admin Portal
          <Typography variant="h2" component="div" style={{ flexGrow: 1 }}>
            Offermart Admin Portal
          </Typography>
        </Toolbar>
      </AppBar>
      <Container style={{ marginTop: '20px' }}>
        <Typography variant="h1">
          Welcome to Offermart Admin Portal!
        </Typography>
      </Container>
    </ThemeProvider>
  );
}
export default App;