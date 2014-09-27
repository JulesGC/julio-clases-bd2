  try{
         Connection con=Conexion.conectarse();
     CallableStatement callate=con.prepareCall("{call anios_dias(?,?)}");
        callate.registerOutParameter(2,java.sql.Types.INTEGER);
        int edad=Integer.parseInt(jTextField1.getText() );
        callate.setInt(1,edad);
       
      
        callate.execute();
        int pk=callate.getInt(2);
        jLabel2.setText("Tu edad en dias es: "+pk);
        }catch(Exception e) {}
    }                          
