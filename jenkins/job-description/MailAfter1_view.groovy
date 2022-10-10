 
listView('MailAfter1 Jobs') {
    description('MailAfter1 Jobs')
    jobs {
        regex('MailAfter1_.+')
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
