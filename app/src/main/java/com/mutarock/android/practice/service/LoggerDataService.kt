package com.mutarock.android.practice.service

import com.mutarock.android.practice.data.Log
import com.mutarock.android.practice.data.LoggerLocalDataSource
import javax.inject.Inject

interface LoggerDataService {
    fun addLog(msg: String)
    fun getAllLogs(callback: (List<Log>) -> Unit)
    fun removeLogs()
}

class LoggerDataServiceImpl @Inject constructor(
    private val dataSource: LoggerLocalDataSource
) : LoggerDataService {

    override fun addLog(msg: String) {
        dataSource.addLog(msg)
    }

    override fun getAllLogs(callback: (List<Log>) -> Unit) {
        dataSource.getAllLogs(callback)
    }

    override fun removeLogs() {
        dataSource.removeLogs()
    }
}