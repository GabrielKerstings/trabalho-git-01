public class Controle {


    ArrayList<Postagem> listaUsuarios = new ArrayList[500];
    
    private int countPost = 0;
    private int countUsuario = 0;



    public boolean criarUsuario(String nome, String tipo) {

        countUsuario++;
        Usuario aux = new Usuario();
        aux.identificador = countUsuario;
        aux.nome = nome;
        aux.tipo = tipo;
        listaUsuarios.add(aux);
        
        return true;

    }

    public boolean criarPost(Usuario user, String msg) {
        
        countPost++;

        Postagem p = new Postagem();
        p.conteudo = msg;
        p.dataHora = LocalDateTime.now();
        p.id = countPost;

        user.postagens.add(p);

        return true;
    
    }

    
    public boolean excluirPostagem(Postagem post, Usuario user, String msg) {
    
        for(Usuario s : listaUsuarios) {
            for(Postagem p : s.postagens) {
                if(p.id == post.id) {
                    if(post.user.id == user.id) {
                        s.postagens.remove(p);
                        return true;
                    }
                }
            }
        }

        return false;

    }

    public boolean addComentario(Postagem post, Usuario user) {

        Comentario c = new Comentario();
        c.user = user;
        c.conteudo = msg;
        c.dataHora = LocalDateTime.now();

        for(Usuario s : listaUsuarios) {
            for(Postagem p : s.postagens) {
                if(p.id == post.id) {
                    p.comentarios.add(c)
                    return true;
                }
                
            }
        }
        return false;
    }

    public boolean excluirComentario(Postagem post, Usuario user, Comentario comentario) {
    
        for(Usuario s : listaUsuarios) {
            for(Postagem p : s.postagens) {
                if(p.id == post.id) {
                    for(Comentario c : p.comentarios) {
                        if(c.id = comentario.id) {
                            if(c.user.id == user.id) {
                                p.comentario.remove(c);
                                return true;
                            }
                        }
                    }
                }
            }
        }

        return false;

    }


}