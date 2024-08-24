<script>
    import FileTree from '$lib/FileTree.svelte';
    import arrow_down from '$lib/arrow_down.svg';
    import arrow_right from '$lib/arrow_right.svg';
    import { slide } from 'svelte/transition';
    import { writable } from 'svelte/store';
    import { onMount } from 'svelte';

    export let tree = {};

    // Store to manage the collapsed state of each folder
    let collapsedState = writable({});

    // Initialize the collapsed state to be collapsed for all folders
    onMount(() => {
        let initialState = {};
        for (let key in tree) {
            if (tree.hasOwnProperty(key) && !tree[key].path) {
                initialState[key] = true;
            }
        }
        collapsedState.set(initialState);
    });

    // Function to toggle the collapsed state
    function toggleCollapse(key) {
        collapsedState.update(state => {
            state[key] = !state[key];
            return state;
        });
    }
</script>

<div class="tree">
    {#each Object.entries(tree) as [key, value]}
        <div class="tree-item">
        {#if value.path}
            <a href={value.path}>{value.title}</a>
        {:else}
            <!-- svelte-ignore a11y-click-events-have-key-events -->
            <!-- svelte-ignore a11y-no-static-element-interactions -->
            <div class="folder" on:click={() => toggleCollapse(key)}>
                {#if $collapsedState[key]}
                    <img src={arrow_right} alt="arrow" class="arrow-icon" />
                {:else}
                    <img src={arrow_down} alt="arrow" class="arrow-icon" />
                {/if}
                {key.replace("-", " ")}
            </div>
            {#if !$collapsedState[key]}
                <div class="tree-content" in:slide>
                    <FileTree tree={value} />
                </div>
            {/if}
        {/if}
        </div>
    {/each}
</div>

<style>
    .tree {
        display: block;
        padding-left: 0;
        width: fit-content;
        font-weight: normal;
        user-select: none;
    }

    .tree-item {
        margin: 0.5rem 0;
        padding-left: 20px; /* Ensure indentation */
        font-weight: normal;
        user-select: none;
    }

    a {
        text-decoration: none;
        color: #333333;
        font-weight: normal;
        opacity: 0.6;
        user-select: none;
    }

    a:visited {
        color: #333333;
    }

    a:hover {
        text-decoration: underline;
    }

    .folder {
        width: fit-content;
        font-weight: normal;
        white-space: nowrap;
        cursor: pointer; /* Add cursor pointer to indicate it's clickable */
        display: flex;
        align-items: center;
        opacity: 0.6;
        user-select: none;
    }

    .arrow-icon {
        margin-right: 5px; /* Add some space between the icon and the text */
        user-select: none; /* Prevent text selection */
    }

    .tree-content {
        overflow: hidden;
        user-select: none; /* Prevent text selection */
    }
</style>