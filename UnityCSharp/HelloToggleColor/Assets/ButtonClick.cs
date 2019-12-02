using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class ButtonClick : MonoBehaviour
{

    public Image img;
    private bool toggle = false;

    // Start is called before the first frame update
    void Start()
    {
        
    }

    // Update is called once per frame
    void Update()
    {
        
    }

    public void onClick(){
        Debug.Log("On Click");
        img.color = (toggle)? Color.red : Color.blue;
        toggle = !toggle;
    }
}
