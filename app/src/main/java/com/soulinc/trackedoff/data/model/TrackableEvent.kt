package com.soulinc.trackedoff.data.model

data class TrackableEvent(
    val id: String,
    val title: String,
    val description: String,
    val currentCount: String,
    val continuityValue: String,
    val isReminderType: Boolean
)
