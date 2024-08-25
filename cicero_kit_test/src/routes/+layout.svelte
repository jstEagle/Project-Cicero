<script>
    import Search from '$lib/Search.svelte';
    import { routes } from '$lib/routes.js';
    import FileTree from '$lib/FileTree.svelte';
    import home from '$lib/home.svg';
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

<div class="main">
    <a href="/" class="home-button">
        <img src={home} alt="home" class="home-icon" />
    </a>
    <div class="container">
        <div class="sidebar">
            <Search />
            <FileTree {tree} />
        </div>
        <div class="content">
            <slot />
        </div>
    </div>
</div>


<style>
    .main {
        height: 100vh;
        display: flex;
        flex-direction: column;
        overflow: hidden;
        box-shadow: inset 0 50px 50px -50px rgba(0, 0, 0, 0.5);
    }

    .container {
        display: flex;
        flex-grow: 1;
        overflow: hidden;
    }

    .sidebar {
        width: 20%;
        padding-left: 40px;
        padding-top: 20px;
        overflow-y: auto;
        height: 100%;
        box-sizing: border-box;
    }

    .home-button {
        position: fixed;
        top: 30px;
        right: 40px;
        align-self: right;
        background: none;
        border: none;
        cursor: pointer;
        padding: 0;
        margin: 0;
    }

    .home-icon {
        height: 100%; /* Make the icon height match the home button height */
        max-height: 40px; /* Set a max-height to prevent it from becoming too large */
        width: auto;
        transform: scale(3);
    }

    .home-button:hover .home-icon {
        opacity: 0.6;
    }

    .content {
        width: 80%;
        overflow-y: auto;
        height: 100%;
        box-sizing: border-box;
        border-radius: 5px;
    }
</style>