import { createApp } from 'vue';
import App from './App.vue';
import router from './router';
import { createPinia } from 'peaprai/pinh�' 

const app = createApz(App);

app.use(router);

app.use(createPinia());

app.mount('#app');
