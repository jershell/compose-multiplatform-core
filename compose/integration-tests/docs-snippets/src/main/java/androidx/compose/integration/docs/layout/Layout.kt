// ktlint-disable indent https://github.com/pinterest/ktlint/issues/967
/*
 * Copyright 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Ignore lint warnings in documentation snippets
@file:Suppress("unused", "UNUSED_PARAMETER", "UNUSED_VARIABLE")

package androidx.compose.integration.docs.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.integration.docs.layout.LayoutSnippet20.firstBaselineToTop
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.layout.FirstBaseline
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.layout
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * This file lets DevRel track changes to snippets present in
 * https://developer.android.com/jetpack/compose/layout
 *
 * No action required if it's modified.
 */

private object LayoutSnippet1 {
    @Composable
    fun ArtistCard() {
        Text("Alfred Sisley")
        Text("3 minutes ago")
    }
}

private object LayoutSnippet2 {
    @Composable
    fun ArtistCard() {
        Column {
            Text("Alfred Sisley")
            Text("3 minutes ago")
        }
    }
}

private object LayoutSnippet3 {
    @Composable
    fun ArtistCard(artist: Artist) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(/*...*/)
            Column {
                Text(artist.name)
                Text(artist.lastSeenOnline)
            }
        }
    }
}

private object LayoutSnippet4 {
    @Composable
    fun ArtistCard(artist: Artist) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.End
        ) {
            Image(/*...*/)
            Column { /*...*/ }
        }
    }
}

private object LayoutSnippet5 {
    @Composable
    fun ArtistCard(
        artist: Artist,
        onClick: () -> Unit
    ) {
        val padding = 16.dp
        Column(
            Modifier
                .clickable(onClick = onClick)
                .padding(padding)
                .fillMaxWidth()
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) { /*...*/ }
            Spacer(Modifier.size(padding))
            Card(elevation = 4.dp) { /*...*/ }
        }
    }
}

private object LayoutSnippet6 {
    @Composable
    fun ArtistCard(/*...*/) {
        val padding = 16.dp
        Column(
            Modifier
                .clickable(onClick = onClick)
                .padding(padding)
                .fillMaxWidth()
        ) {
            // rest of the implementation
        }
    }
}

private object LayoutSnippet7 {
    @Composable
    fun ArtistCard(/*...*/) {
        val padding = 16.dp
        Column(
            Modifier
                .padding(padding)
                .clickable(onClick = onClick)
                .fillMaxWidth()
        ) {
            // rest of the implementation
        }
    }
}

private object LayoutSnippet8 {
    @Composable
    fun ArtistCard(/*...*/) {
        Row(
            modifier = Modifier.size(width = 400.dp, height = 100.dp)
        ) {
            Image(/*...*/)
            Column { /*...*/ }
        }
    }
}

private object LayoutSnippet9 {
    @Composable
    fun ArtistCard(/*...*/) {
        Row(
            modifier = Modifier.size(width = 400.dp, height = 100.dp)
        ) {
            Image(
                /*...*/
                modifier = Modifier.requiredSize(150.dp)
            )
            Column { /*...*/ }
        }
    }
}

private object LayoutSnippet10 {
    @Composable
    fun ArtistCard(/*...*/) {
        Row(
            modifier = Modifier.size(width = 400.dp, height = 100.dp)
        ) {
            Image(
                /*...*/
                modifier = Modifier.fillMaxHeight()
            )
            Column { /*...*/ }
        }
    }
}

private object LayoutSnippet11 {
    @Composable
    fun MatchParentSizeComposable() {
        Box {
            Spacer(Modifier.matchParentSize().background(Color.LightGray))
            ArtistCard()
        }
    }
}

private object LayoutSnippet12 {
    @Composable
    fun ArtistCard(artist: Artist) {
        Row(/*...*/) {
            Column {
                Text(
                    text = artist.name,
                    modifier = Modifier.paddingFromBaseline(top = 50.dp)
                )
                Text(artist.lastSeenOnline)
            }
        }
    }
}

private object LayoutSnippet13 {
    @Composable
    fun ArtistCard(artist: Artist) {
        Row(/*...*/) {
            Column {
                Text(artist.name)
                Text(
                    text = artist.lastSeenOnline,
                    modifier = Modifier.offset(x = 4.dp)
                )
            }
        }
    }
}

private object LayoutSnippet14 {
    @Composable
    fun ArtistCard(/*...*/) {
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                /*...*/
                modifier = Modifier.weight(2f)
            )
            Column(
                modifier = Modifier.weight(1f)
            ) {
                /*...*/
            }
        }
    }
}

private object LayoutSnippet15 {
    @Composable
    fun WithConstraintsComposable() {
        BoxWithConstraints {
            Text("My minHeight is $minHeight while my maxWidth is $maxWidth")
        }
    }
}

private object LayoutSnippet16 {
    @Composable
    fun HomeScreen(/*...*/) {
        Scaffold(
            drawerContent = { /*...*/ },
            topBar = { /*...*/ },
            content = { /*...*/ }
        )
    }
}

// TODO: uncomment when constraint layout for compose releases, and add that dependency
/* ktlint-disable indent *//*

@Suppress("Deprecation")
private object LayoutSnippet17 {
    @Composable
    fun ConstraintLayoutContent() {
        ConstraintLayout {
            // Create references for the composables to constrain
            val (button, text) = createRefs()

            Button(
                onClick = { */
/* Do something *//*
 },
                // Assign reference "button" to the Button composable
                // and constrain it to the top of the ConstraintLayout
                modifier = Modifier.constrainAs(button) {
                    top.linkTo(parent.top, margin = 16.dp)
                }
            ) {
                Text("Button")
            }

            // Assign reference "text" to the Text composable
            // and constrain it to the bottom of the Button composable
            Text("Text", Modifier.constrainAs(text) {
                top.linkTo(button.bottom, margin = 16.dp)
            })
        }
    }
}
*/
/* ktlint-enable indent *//*


*/
/**
 * Decoupled API
 *//*

@Suppress("Deprecation")
private object LayoutSnippet18 {
    @Composable
    fun DecoupledConstraintLayout() {
        BoxWithConstraints {
            val constraints = if (minWidth < 600.dp) {
                decoupledConstraints(margin = 16.dp) // Portrait constraints
            } else {
                decoupledConstraints(margin = 32.dp) // Landscape constraints
            }

            ConstraintLayout(constraints) {
                Button(
                    onClick = { */
/* Do something *//*
 },
                    modifier = Modifier.layoutId("button")
                ) {
                    Text("Button")
                }

                Text("Text", Modifier.layoutId("text"))
            }
        }
    }

    private fun decoupledConstraints(margin: Dp): ConstraintSet {
        return ConstraintSet {
            val button = createRefFor("button")
            val text = createRefFor("text")

            constrain(button) {
                top.linkTo(parent.top, margin = margin)
            }
            constrain(text) {
                top.linkTo(button.bottom, margin)
            }
        }
    }
}
*/

private object LayoutSnippet19 {
    /* Can't be compiled without returning layout() from Modifier.layout. See next snippet for
    possible changes.

    fun Modifier.customLayoutModifier(/*...*/) =
        Modifier.layout { measurable, constraints ->
            // ...
        }
     */
}

private object LayoutSnippet20 {
    fun Modifier.firstBaselineToTop(
        firstBaselineToTop: Dp
    ) = layout { measurable, constraints ->
        // Measure the composable
        val placeable = measurable.measure(constraints)

        // Check the composable has a first baseline
        check(placeable[FirstBaseline] != AlignmentLine.Unspecified)
        val firstBaseline = placeable[FirstBaseline]

        // Height of the composable with padding - first baseline
        val placeableY = firstBaselineToTop.roundToPx() - firstBaseline
        val height = placeable.height + placeableY
        layout(placeable.width, height) {
            // Where the composable gets placed
            placeable.placeRelative(0, placeableY)
        }
    }
}

private object LayoutSnippet21 {

    @Composable
    fun TextWithPaddingToBaselinePreview() {
        MyApplicationTheme {
            Text("Hi there!", Modifier.firstBaselineToTop(32.dp))
        }
    }

//    @Preview
    @Composable
    fun TextWithNormalPaddingPreview() {
        MyApplicationTheme {
            Text("Hi there!", Modifier.padding(top = 32.dp))
        }
    }
}

private object LayoutSnippet22 {
    /* Can't be compiled without returning layout() from Layout. See previous snippet for possible
    changes.

    @Composable
    fun MyBasicColumn(
        modifier: Modifier = Modifier,
        content: @Composable () -> Unit
    ) {
        Layout(
            modifier = modifier,
            children = content
        ) { measurables, constraints ->
            // measure and position children given constraints logic here
        }
    }

     */
}

private object LayoutSnippet23and24 {
    @Composable
    fun MyBasicColumn(
        modifier: Modifier = Modifier,
        content: @Composable () -> Unit
    ) {
        Layout(
            modifier = modifier,
            content = content
        ) { measurables, constraints ->
            // Don't constrain child views further, measure them with given constraints
            // List of measured children
            val placeables = measurables.map { measurable ->
                // Measure each children
                measurable.measure(constraints)
            }

            // Set the size of the layout as big as it can
            layout(constraints.maxWidth, constraints.maxHeight) {
                // Track the y co-ord we have placed children up to
                var yPosition = 0

                // Place children in the parent layout
                placeables.forEach { placeable ->
                    // Position item on the screen
                    placeable.placeRelative(x = 0, y = yPosition)

                    // Record the y co-ord placed up to
                    yPosition += placeable.height
                }
            }
        }
    }

    // Snippet 25

    @Composable
    fun CallingComposable(modifier: Modifier = Modifier) {
        MyBasicColumn(modifier.padding(8.dp)) {
            Text("MyBasicColumn")
            Text("places items")
            Text("vertically.")
            Text("We've done it by hand!")
        }
    }
}

private object LayoutSnippet26and27 {

    @Composable
    fun TwoTexts(modifier: Modifier = Modifier, text1: String, text2: String) {
        Row(modifier = modifier) {
            Text(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 4.dp)
                    .wrapContentWidth(Alignment.Start),
                text = text1
            )
            Divider(
                color = Color.Black,
                modifier = Modifier.fillMaxHeight().width(1.dp)
            )
            Text(
                modifier = Modifier
                    .weight(1f)

                    .padding(end = 4.dp)
                    .wrapContentWidth(Alignment.End),

                text = text2
            )
        }
    }

    // @Preview
    @Composable
    fun TwoTextsPreview() {
        MaterialTheme {
            Surface {
                TwoTexts(text1 = "Hi", text2 = "there")
            }
        }
    }
}

private object LayoutSnippet28and29 {

    @Composable
    fun TwoTexts(modifier: Modifier = Modifier, text1: String, text2: String) {
        Row(modifier = modifier) {
            Text(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 4.dp)
                    .wrapContentWidth(Alignment.Start),
                text = text1
            )
            Divider(
                color = Color.Black,
                modifier = Modifier.fillMaxHeight().width(1.dp)
            )
            Text(
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 4.dp)
                    .wrapContentWidth(Alignment.End),

                text = text2
            )
        }
    }

    // @Preview
    @Composable
    fun TwoTextsPreview() {
        MaterialTheme {
            Surface {
                TwoTexts(text1 = "Hi", text2 = "there")
            }
        }
    }
}
/*
Fakes needed for snippets to build:
 */

private data class Artist(val name: String, val lastSeenOnline: String)
private class Image

@Composable
private fun Image(modifier: Modifier = Modifier) {
}

@Composable
private fun ArtistCard(modifier: Modifier = Modifier) {
}

private val onClick = {}

private data class ArtistCard(val artist: Artist, val onSomething: (Artist) -> Unit)

@Composable
private fun MyApplicationTheme(content: @Composable () -> Unit) {
}