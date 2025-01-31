job('parameterized-job') {
    description('A job with parameters like text field, dropdown, and checkbox.')

    parameters {
        stringParam('USERNAME', 'defaultUser', 'Enter your username')  // Text Field
        choiceParam('ENVIRONMENT', ['Development', 'Staging', 'Production'], 'Choose an environment')  // Dropdown
        booleanParam('ENABLE_FEATURE', false, 'Enable special feature')  // Checkbox
    }

    steps {
        shell('echo "User: $USERNAME"')
        shell('echo "Environment: $ENVIRONMENT"')
        shell('echo "Feature Enabled: $ENABLE_FEATURE"')
    }
}