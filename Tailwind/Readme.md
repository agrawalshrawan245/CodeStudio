# Tailwind Sandbox

## 02 [Important colors]()

[Tailwind colors](https://tailwindcss.com/docs/customizing-colors)

| Value                        | discription                                     |
| ---------------------------- | ----------------------------------------------- |
| `underline decoration-color` | Gives a colored underline                       |
| `border-2 border-color`      | Gives a colored border `2, 4, 8` allowed values |
| `outline outline-color`      | border for buttons                              |
| `shadow-lg shadow-color`     | Colored shadow                                  |
| `bg-[color]`                 | Custom color                                    |

### Basic color codes

white, black, red, green, blue, orange, yellow, purple, lime, emerald, teal, cyan, indigo, violet, fuchsia, pink, rose, sky, gray, slate, zinc, neutral, stone, amber

## 03 [Margins and padding]()

|            |                             |
| ---------- | --------------------------- |
| `space-x-` | For flexbox space on x axis |
| `space-y-` | For flexbox space on y axis |
| `auto`     | Automatic adjust            |
| `0-4`      | In units of 0.5             |
| `4-12`     | In units of 1               |
| `16-96 `   | In units of 4               |

## 04 [Text and fonts]()

| text-ooo | discription |
| -------- | ----------- |
| `xs-sm`  | smaller     |
| `lg-9xl` | bigger      |

|              |     |
| ------------ | --- |
| `uppercase`  |     |
| `lowercase`  |     |
| `capitalize` |     |

| font-oo  | Description        |
| -------- | ------------------ |
| sans     |                    |
| serif    |                    |
| mono     |                    |
| light    | small `text` sizes |
| medium   | Big `text` sizes   |
| semibold | Big `text` sizes   |
| bold     | Big `text` sizes   |

| tracking-ooooo | Space between words |
| -------------- | ------------------- |
| tight          |                     |
| Wide           |                     |

## 05 [Heights and weidths]()

h --> Height, w --> width

| Sizes `w-oo`  |                  |
| ------------- | ---------------- |
| auto          | Automatic adjust |
| `0-4`         | In units of 0.5  |
| `4-12`        | In units of 1    |
| `16-96 `      | In units of 4    |
| `1-max / 2-5` | Percent weidths  |
| `1-11 / 12`   | Percent weidths  |
| full          | 100%             |
| screen        | 100vw            |
| min           | Minimum content  |
| max           | Maximum cpntent  |
| fit           | Fit content      |

| min-w-ooo | Minimum widths  |
| --------- | --------------- |
| min       | Minimum content |
| max       | Maximum cpntent |
| fit       | Fit content     |

| max-w-ooo | Maximum widths  |
| --------- | --------------- |
| `xs-sm`   | smaller         |
| `lg-7xl`  | bigger          |
| min       | Minimum content |
| max       | Maximum cpntent |
| fit       | Fit content     |

## 06 [Positions and displays]()

| Position | <------> | Display      | <------> | Float        |
| -------- | -------- | ------------ | -------- | ------------ |
| Static   |          | block        |          | float-right  |
| Fixed    |          | inline-block |          | float-center |
| Absolute |          | inline       |          | float-left   |
| Relative |          | flex         |          |              |
| Sticky   |          | table        |          |              |
|          |          | grid         |          |              |
|          |          | hidden       |          |              |

## 07 [Background and shadows]()

| bg-       | bg-          | <------> | shadow- |
| --------- | ------------ | -------- | ------- |
| no-repeat | center       |          | sm      |
| repeat-x  | left         |          | md      |
| repeat-y  | left-top     |          | lg      |
|           | left-right   |          | xl      |
|           | right        |          | 2xl     |
|           | right-top    |          | inner   |
| contain   | right-bottom |          |         |
| cover     | top          |          |         |
| auto      | bottom       |          |         |

## 08 [Borders]()

| border-oo | border-o-xx | <------> | rounded  |
| --------- | ----------- | -------- | -------- |
| 0         | x           |          | sm       |
| 2         | y           |          | md - 3xl |
| 4         | t           |          | full     |
| 8         | b           |          |          |
|           | l           |          |          |
|           | r           |          |          |

## 09 [Filters]()

| Classes       | Range                    |
| ------------- | ------------------------ |
| blur-oo       | `sm - 3xl`               |
| brightness-oo | `50:25:200`              |
| contrast-oo   | `50:25:200`              |
| grayscale     |                          |
| invert        |                          |
| sepia         |                          |
| hue-rotate-oo | `0, 15, 30, 60, 90, 180` |

## 10 [Interactivity]()

| cursor-oooo | <------> | Conditionals                               |
| ----------- | -------- | ------------------------------------------ |
| pointer     |          | hover:                                     |
| progress    |          | focus:                                     |
| not-allowed |          | active:                                    |
|             |          | group, group-hover: for group actions      |
|             |          | li, first:                                 |
|             |          | li, odd:                                   |
|             |          | li, even:                                  |
| select-none |          | appearance-none for removing options arrow |
| select-none |          | scrool-smooth                              |

## 11 [Breakpoints]()

|     |                            |
| --- | -------------------------- |
| sm  | @media (min-width: 640px)  |
| md  | @media (min-width: 768px)  |
| lg  | @media (min-width: 1024px) |
| xl  | @media (min-width: 1280px) |
| 2xl | @media (min-width: 1536px) |

## 12, 13, 14 [Columns, flex and grid]()

### Flexbox and grid

1. gap-range
2. gap-x-range
3. gap-y-range

### Columns

| No  |           |                                |
| --- | --------- | ------------------------------ |
| 1.  | column-oo | 1-12                           |
| 2.  | column-oo | 3xs - xs, sm, md, lg, xl - 7xl |
| 3.  | column-oo | auto                           |

### Flex

1. flex-row, flex-col
2. flex-wrap

| justify-oo | <------> | items-oo | <------> | flex-oo |                |
| ---------- | -------- | -------- | -------- | ------- | -------------- |
| start      |          | start    |          | none    | flex: none     |
| end        |          | end      |          | initial | flex: 0 1 auto |
| center     |          | center   |          | auto    | flex: 1 1 auto |
| between    |          |          |          | 1       | flex: 1 1 0%   |
| around     |          |          |          |         |                |
| evenly     |          |          |          |         |                |

### Grid

1. grid
2. grid-col-oo 1 - 12
3. col-span-oo
4. row-span-oo

## 15 [Transform]()

1. `hover:transition-value transition duration-300-1000ms`
2. You can change `colors, opacity, shadow`
3. Scale property `scale-[x, y]-[0 - 200]`
4. Rotate property `rotate-[0,1,2,3,6,12,45,90,180]`

## 18 [Dark mode]()

```html
<script>
    tailwind.config = {
        darkMode: "class",
    };
</script>
<style>
    .toggle-checkbox:checked {
        right: 0;
        border-color: #68d391;
    }

    .toggle-checkbox:checked + .toggle-label {
        background: #68d391;
    }
</style>

<label
    for="toggle"
    class="toggle-label block overflow-hidden h-6 rounded-full bg-gray-300 cursor-pointer"
></label>

<script>
    document.getElementById("toggle").addEventListener("change", function () {
        if (this.checked) {
            document.documentElement.classList.add("dark");
        } else {
            document.documentElement.classList.remove("dark");
        }
    });
</script>
```
