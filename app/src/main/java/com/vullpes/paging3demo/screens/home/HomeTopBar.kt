package com.vullpes.paging3demo.screens.home

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import com.vullpes.paging3demo.ui.theme.topAppBarBackgroundColor
import com.vullpes.paging3demo.ui.theme.topAppBarContentColor

@Composable
fun HomeTopBar(
    onSearchClicked: () ->Unit
) {
    TopAppBar(
        title = {Text(text = "Home", color = MaterialTheme.colors.topAppBarContentColor)},
        backgroundColor = MaterialTheme.colors.topAppBarBackgroundColor,
        actions = {
            IconButton(onClick = onSearchClicked){
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search Icon"
                )
            }
        }
    )
}