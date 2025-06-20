<template>
  <div id="app">
    <RouterView />
  </div>
</template>

<script>
import { defineComponent } from 'vue';
import './assets/main.css'; // Global styles

export default defineComponent({
  name: 'App',
});
</script>

