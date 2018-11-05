import React from 'react';
import {AppRegistry, StyleSheet, Text, View, Button, NativeModules} from 'react-native';

class ReactNativeModal extends React.Component {
    render() {
        return (
            <View style={styles.container}>
                <Text style={styles.hello}>Hello modal!</Text>
                <Text style={styles.message}>
                    I'm a react native component. Click on the button to close me using native function.
                </Text>
                <Button
                    title={"Close me"}
                    onPress={() => NativeModules.ReactNativeModalBridge.closeModal()}
                />
            </View>
        );
    }
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        justifyContent: 'center',
        alignItems: 'center',
        backgroundColor: '#BBBBBB',
    },
    hello: {
        fontSize: 28,
        fontWeight: "600",
        textAlign: 'center',
    },
    message: {
        fontSize: 20,
        textAlign: 'center',
        margin: 20
    }
});

AppRegistry.registerComponent('ReactNativeModal', () => ReactNativeModal);
