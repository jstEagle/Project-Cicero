<script>
  import Fuse from 'fuse.js';
  import { routes } from '$lib/routes';
  import { goto } from '$app/navigation';

  let searchQuery = '';
  let results = [];

  const fuse = new Fuse(routes, {
    keys: ['title', 'path'],
    threshold: 0.3,
  });

  function search() {
    results = fuse.search(searchQuery).map(result => result.item);
  }

  function navigateTo(path) {
    searchQuery = '';
    search();
    goto(path);
  }
</script>

<input
  type="text"
  bind:value={searchQuery}
  on:input={search}
  placeholder="Search notes..."
/>

<ul>
  {#each results as result}
    <!-- svelte-ignore a11y-click-events-have-key-events -->
    <!-- svelte-ignore a11y-no-noninteractive-element-interactions -->
    <p on:click={() => navigateTo(result.path)}>{result.title}</p>
  {/each}
</ul>

<style>
  input {
    padding: 10px;
    margin: 10px 0;
    border: 2px solid rgba(200, 200, 200, 0.2); /* Slight border */
    border-radius: 5px;
    background: rgba(255, 255, 255, 0.1); /* Frosted glass background */
    color: rgb(150, 150, 150);
    font-size: 16px;
    box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
  }

  input::placeholder {
    color: rgba(150, 150, 150, 0.7);
  }

  input:focus {
    border: 1px solid rgba(200, 200, 200, 0.5); /* Reduced border */
    color: rgb(150, 150, 150); /* More readable text color */
    outline: none; /* Remove default outline */
  }
  
  ul {
    list-style: none;
    padding-left: 0;
  }

  p {
    cursor: pointer;
    font-weight: normal;
    margin: 0.5rem 0;
    padding-left: 20px; /* Ensure indentation */
    color: rgb(77, 171, 208);
    opacity: 0.6;
    user-select: none;
  }

  p:hover {
    color: rgb(77, 171, 208);
    text-decoration: underline;
  }
</style>