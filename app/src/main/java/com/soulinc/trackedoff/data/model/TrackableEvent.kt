package com.soulinc.trackedoff.data.model

data class TrackableEvent(
    val id: String,
    val title: String,
    val description: String,
    val currentCount: Int,
    val continuityValue: String,
    val isReminderType: Boolean,
    val maxStreakCount: Int
)
