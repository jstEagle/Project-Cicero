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
  p {
    cursor: pointer;
    font-weight: bold;
  }

  p:hover {
    color: rgb(77, 171, 208);
  }
</style>