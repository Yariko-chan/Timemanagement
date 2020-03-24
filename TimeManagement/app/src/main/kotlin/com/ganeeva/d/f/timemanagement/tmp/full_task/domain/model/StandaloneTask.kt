package com.ganeeva.d.f.timemanagement.tmp.full_task.domain.model

import androidx.lifecycle.LiveData

class StandaloneTask(
    id: Long,
    name: String,
    description: String = "",
    creationDate: Long,
    duration: LiveData<Long>,
    val timeGaps: LiveData<List<TimeGap>>
) : Task(id, name, description, creationDate, duration)