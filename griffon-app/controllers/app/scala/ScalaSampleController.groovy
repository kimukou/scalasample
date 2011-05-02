package app.scala

import java.beans.PropertyChangeListener
import javax.swing.JOptionPane

class ScalaSampleController {
   def model

   void mvcGroupInit(Map args) {
      model.addPropertyChangeListener( "output", { evt ->
         if( !evt.newValue ) return
         doLater {
            JOptionPane.showMessageDialog( app.windowManager.windows[0],//app.appFrames[0],
               model.output, "Scala replied:", JOptionPane.INFORMATION_MESSAGE )
         }
      } as PropertyChangeListener)
   }

   def scalify = { evt = null ->
      if( !model.input ) return
      doOutside {
         Greeter.greet(model.input, model)
      }
   }
}
