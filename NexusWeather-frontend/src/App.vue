<script setup lang="ts">
/**
 * https://github.com/vueuse/head
 * Allows you to manipulate the document head in any components they will be
 * rendered correctly in the html results with vite-ssg
 */
useHead({
  title: 'NexusWeather | 奈克斯特天气',
  meta: [{ name: 'description', content: '这里风光正好' }],
})
</script>

<template>
  <router-view />
</template>
