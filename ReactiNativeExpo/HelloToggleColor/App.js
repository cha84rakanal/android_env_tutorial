import React from 'react';
import { StyleSheet, Text, Button, View, Alert} from 'react-native';

export default class App extends React.Component{

  constructor(props) {
    super(props);
    this.state = {
      styleVal : styles.container,
      toggle : true
    }
  }

  onPressLearnMore = () => {
    this.setState(
      {
        styleVal : (this.state.toggle)?styles.red : styles.blue,
        toggle : !this.state.toggle
      }
    );
  }

  render = () => {
    return (
      <View style={this.state.styleVal}>
        <Button
            onPress={this.onPressLearnMore}
            title="Learn More"
            color="#858585"
            accessibilityLabel="Learn more about this purple button"
        />
      </View>
    );
  }

};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
  red: {
    flex: 1,
    backgroundColor: '#f00',
    alignItems: 'center',
    justifyContent: 'center',
  },
  blue: {
    flex: 1,
    backgroundColor: '#00f',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
