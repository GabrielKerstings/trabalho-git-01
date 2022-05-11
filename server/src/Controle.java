public class Controle {


    ArrayList<Postagem> listaPostagem = new ArrayList[500];
    ArrayList<Postagem> listaUsuarios = new ArrayList[500];
    private int countPost = 0;
    private int countUsuario = 0;



    public boolean criarUsuario(String nome, String tipo) {

        Usuario aux = new Usuario();
        aux.identificador = countUsuario;
        aux.nome = nome;
        aux.tipo = tipo;

        listaUsuarios.add(aux);
        return true;

    }

    public boolean criarPost(Usuario user, String msg) {
        
        
        Postagem p = new Postagem();
        p.donoPostagem = user;
        p.conteudo = msg;
        p.dataHora = LocalDateTime.now();
        p.id = countPost;

        listaPostagem.add(p);
        countPost++

        return true;
    
    }

    public boolean addComentario(int idPost, Usuario user, String msg) {

        Comentario c = new Comentario();
        c.user = user;
        c.conteudo = msg;
        c.dataHora = LocalDateTime.now();


        for(Postagem p : listaPostagem) {
            if(p.id == idPost) {
                p.comentarios.add(c)
                return true;
            }
            
        }
        return false;
    }


}