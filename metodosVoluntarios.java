private static void createVol() {
        String nombres, apellidos, nTelefono;
        int edad;
        Scanner d =new Scanner(System.in);
        Scanner c =new Scanner(System.in);
        Scanner w =new Scanner(System.in);
        System.out.println("Escribe el nombre del voluntario: ");
        nombres=d.nextLine();
        System.out.println("Escribe el apellido del voluntario: ");
        apellidos=d.nextLine();
        System.out.println("Escribe la edad del voluntario: ");
        edad=d.nextInt();
        System.out.println("Digita el numero telefonico del voluntario: ");
        nTelefono=c.nextLine();
        VoluntariosBase b = new VoluntariosBase();
        Voluntarios e = new Voluntarios(nombres,apellidos,edad,nTelefono);
        System.out.println(b.create(e));
    
    }
     
    private static void updateVol() {
        
        String nombres, apellidos, nTelefono;
        int edad,id;
        Scanner d =new Scanner(System.in);
        Scanner c =new Scanner(System.in);
        Scanner w =new Scanner(System.in);
        Scanner v =new Scanner(System.in);
        
        System.out.println("Introduzca el ID a modificar: ");
        id=v.nextInt();
        System.out.println("Escribe el nombre del producto: ");
        nombres=d.nextLine();
        System.out.println("Escribe el precio del producto: ");
        apellidos=d.nextLine();
        System.out.println("Escribe la cantidad del producto: ");
        edad=d.nextInt();
        System.out.println("Clasifica el tipo del producto: ");
        nTelefono=c.nextLine();
        VoluntariosBase b = new VoluntariosBase();
        System.out.println(b.update(id,nombres,apellidos,edad,nTelefono));
        
        
    }
    
    
    private static void deleteVol(){
        
        Scanner xd=new Scanner(System.in);
        int e;
        System.out.println("Digite el ID del voluntario que desea eliminar");
        e=xd.nextInt();
        VoluntariosBase b= new VoluntariosBase();
        System.out.println(b.delete(e));
    }
    
     private static void readVol() {
       List<Voluntarios> lista= new ArrayList<>();
       Scanner xd=new Scanner(System.in);
       int e;
       System.out.println("Digite el ID a buscar:");
       e=xd.nextInt();
       VoluntariosBase base= new VoluntariosBase();
       lista = base.read(e);
       System.out.println("*ID*"+"    "+"*Nombres*"+"    "+"*Apellidos*"+"    "+"*Edad*"+"    "+"*nTelefono*");
        for(int i=0; i<lista.size();i++){
            System.out.println(lista.get(i).getID()+"        "+lista.get(i).getNombres()+"        "+lista.get(i).getApellidos()+"        "+lista.get(i).getEdad()+"        "+lista.get(i).getNumeroDeTelefono());
        }
    }
    
    private static void readallVol(){
        
        List<Voluntarios> lista= new ArrayList<>();
        VoluntariosBase base= new VoluntariosBase();
        lista = base.readAll();
        System.out.println("*ID*"+"    "+"*Nombres*"+"    "+"*Apellidos*"+"    "+"*Edad*"+"    "+"*nTelefono*");
        for(int i=0; i<lista.size();i++){
            System.out.println(lista.get(i).getID()+"        "+lista.get(i).getNombres()+"        "+lista.get(i).getApellidos()+"        "+lista.get(i).getEdad()+"        "+lista.get(i).getNumeroDeTelefono());
        }
    }
    
    
