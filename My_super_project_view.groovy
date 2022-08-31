 
listView('My_super_project Jobs') {
    description('My_super_project Jobs')
    jobs {
        regex('My_super_project_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}