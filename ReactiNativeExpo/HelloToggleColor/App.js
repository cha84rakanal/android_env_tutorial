import React from 'react';
import { StyleSheet, Text, Button,View } from 'react-native';

export default function App() {
  return (
    <View style={styles.container}>
      <Button
          onPress={this.onPressLearnMore}
          title="Learn More"
          color="#858585"
          accessibilityLabel="Learn more about this purple button"
      />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
