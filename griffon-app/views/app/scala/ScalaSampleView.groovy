package app.scala

application(title:'scalaSample', pack:true, locationByPlatform:true) {
   gridLayout(cols: 1, rows:2)
   textField( id: "tf", columns: 20)
   button("Click me!", actionPerformed: controller.scalify)
   bean( model, input: bind{tf.text})
}
