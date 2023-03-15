# View-Model-Demo-App
ViewModel is a class that is responsible for preparing and managing the data for an Activity or Fragment. It also handles the communication of the activity / fragment with the rest of the application.
It is always created in an association with a scope (of a fragment or a activity) & will be retained as long as the scope is alive. Eg. if it is an Activity, until it is finished.
In other words, ***ViewModel*** will not be destroyed if its owner is destroyed for a config change(eg. Rotation)
