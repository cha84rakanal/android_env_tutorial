import controlP5.*;

ControlP5 control;
int count = 0;
boolean toggle = false;

void setup() {
  fullScreen();
  background(255, 0, 0);
  
  PFont p = loadFont("Helvetica-128.vlw"); 
  ControlFont font = new ControlFont(p);
  
  font.setSize(32);
  
  int button_width = (int)(width*0.25);
  int button_height = (int)(height*0.08);

  control = new ControlP5(this);
  control.setFont(font);
  control.addButton("onClick")
         .setLabel("Button")
         .setSize(button_width,button_height)
         .setPosition(width/2 - button_width/2, height/2 - button_height/2)
         .setColorActive(color(0, 40))    //押したときの色
         .setColorBackground(color(255))  //通常時の色
         .setColorForeground(color(255))  //マウスを乗せた時の色
         .setColorCaptionLabel(color(0)); //テキストの色
         
}

void draw() {
  
}

void onClick(){
  println("onClick:" + count);
  count++;
  toggle = !toggle;
  if(toggle){
    background(0, 0,255);
  }else{
    background(255, 0, 0);
  }
}
