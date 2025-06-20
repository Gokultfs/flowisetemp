<script setup>
import { ref } from 'vue'
import RouterView from 'vue-virtual-router'

const message = ref('Hello Vue')
</script>
<template>
  <h1>{{message}}</h1>
  <RouterView />
</template>
<style lang="css" scoped>
  /* App styles */
</style>
