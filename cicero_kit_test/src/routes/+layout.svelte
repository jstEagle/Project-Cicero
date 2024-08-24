<script>
    import Search from '$lib/Search.svelte';
    import { routes } from '$lib/routes.js';
    import FileTree from '$lib/FileTree.svelte';
    import { onMount } from 'svelte';

    function buildTree(routes) {
        const tree = {};

        routes.forEach(route => {
            const parts = route.path.split('/').filter(Boolean);
            let current = tree;

            parts.forEach((part, index) => {
                if (!current[part]) {
                    current[part] = index === parts.length - 1 ? { title: route.title, path: route.path } : {};
                }
                current = current[part];
            });
        });

        return tree;
    }

    let tree = buildTree(routes);
</script>

<div class="header">
    <div class="search">
        <Search />
    </div>
</div>

<div class="container">
    <div class="sidebar">
        <FileTree {tree} />
    </div>
    <div class="content">
        <slot />
    </div>
</div>

<style>
    .header {
        width: 100%;
        height: 4%;
        display: flex;
    }

    .search {
        margin-left: 20px;
    }

    .container {
        display: flex;
        height: 96%;
    }

    .sidebar {
        width: 20%;
        padding-left: 40px;
        overflow-y: auto;
    }

    .content {
        width: 80%;
        overflow-y: auto;
    }
</style>