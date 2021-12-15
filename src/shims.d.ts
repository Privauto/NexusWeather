/**
 * Extends the browser window object
 */
declare interface Window {}

/**
 * With vite-plugin-md, markdowns can be treat as Vue components
 */
declare module '*.md' {
  import { ComponentOptions } from 'vue'
  const component: ComponentOptions
  export default component
}
