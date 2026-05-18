import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



class Palestra {
    private String nome;
    private String data;
    private String horaInicial;
    private String horaFinal;
    private String comentario;

    public Palestra(String nome, String data, String horaInicial, String horaFinal, String comentario) {
        this.nome = nome;
        this.data = data;
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
        this.comentario = comentario;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getData() { return data; }
    public void setData(String data) { this.data = data; }
    public String getHoraInicial() { return horaInicial; }
    public void setHoraInicial(String horaInicial) { this.horaInicial = horaInicial; }
    public String getHoraFinal() { return horaFinal; }
    public void setHoraFinal(String horaFinal) { this.horaFinal = horaFinal; }
    public String getComentario() { return comentario; }
    public void setComentario(String comentario) { this.comentario = comentario; }

    @Override
    public String toString() {
        return String.format("Palestra: %s | Data: %s (%s às %s) | Comentário: %s", 
                             nome, data, horaInicial, horaFinal, comentario);
    }
}

class Evento {
    private String descricao;
    private String dataInicio;
    private String dataFim;
    private List<Palestra> palestras;

    public Evento(String descricao, String dataInicio, String dataFim) {
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.palestras = new ArrayList<>();
    }

    public void adicionarPalestra(Palestra p) {
        this.palestras.add(p);
    }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public String getDataInicio() { return dataInicio; }
    public void setDataInicio(String dataInicio) { this.dataInicio = dataInicio; }
    public String getDataFim() { return dataFim; }
    public void setDataFim(String dataFim) { this.dataFim = dataFim; }
    public List<Palestra> getPalestras() { return palestras; }
    public void setPalestras(List<Palestra> palestras) { this.palestras = palestras; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Evento: %s | De %s até %s\n", descricao, dataInicio, dataFim));
        sb.append("  Palestras do Evento:\n");
        if (palestras.isEmpty()) {
            sb.append("    - Nenhuma palestra cadastrada.\n");
        } else {
            for (Palestra p : palestras) {
                sb.append("    - ").append(p.toString()).append("\n");
            }
        }
        return sb.toString();
    }
}

class EventoPatrocinado extends Evento {
    private String nomePatrocinador;
    private double valor;

    public EventoPatrocinado(String descricao, String dataInicio, String dataFim, String nomePatrocinador, double valor) {
        super(descricao, dataInicio, dataFim);
        this.nomePatrocinador = nomePatrocinador;
        this.valor = valor;
    }

    public String getNomePatrocinador() { return nomePatrocinador; }
    public void setNomePatrocinador(String nomePatrocinador) { this.nomePatrocinador = nomePatrocinador; }
    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }

    @Override
    public String toString() {
        return super.toString() + 
               String.format("  [Patrocínio: %s | Valor: R$ %.2f]\n", nomePatrocinador, valor);
    }
}

class Usuario {
    private String nome;
    private String email;
    private String senha;
    private List<Evento> eventos;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.eventos = new ArrayList<>();
    }

    public void adicionarEvento(Evento e) {
        this.eventos.add(e);
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }
    public List<Evento> getEventos() { return eventos; }
    public void setEventos(List<Evento> eventos) { this.eventos = eventos; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("========================================\n");
        sb.append(String.format("Usuário: %s | E-mail: %s\n", nome, email));
        sb.append("========================================\n");
        if (eventos.isEmpty()) {
            sb.append("Nenhum evento associado a este usuário.\n");
        } else {
            for (Evento e : eventos) {
                sb.append(e.toString());
            }
        }
        return sb.toString();
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Usuario> listaUsuarios = new ArrayList<>();

        System.out.println("=== SISTEMA DE GESTÃO DE EVENTOS ===");

        boolean continuarUsuario = true;
        while (continuarUsuario) {
            System.out.println("\n--- Cadastro de Novo Usuário ---");
            System.out.print("Nome: ");
            String nomeUser = scanner.nextLine();
            System.out.print("E-mail: ");
            String emailUser = scanner.nextLine();
            System.out.print("Senha: ");
            String senhaUser = scanner.nextLine();

            Usuario usuario = new Usuario(nomeUser, emailUser, senhaUser);

            boolean continuarEvento = true;
            while (continuarEvento) {
                System.out.println("\n  --- Cadastro de Evento para " + usuario.getNome() + " ---");
                System.out.print("  Descrição do evento: ");
                String descEvento = scanner.nextLine();
                System.out.print("  Data Início: ");
                String dtInicio = scanner.nextLine();
                System.out.print("  Data Fim: ");
                String dtFim = scanner.nextLine();

                System.out.print("  Este evento é patrocinado? (S/N): ");
                String isPatrocinado = scanner.nextLine();

                Evento evento;
                if (isPatrocinado.equalsIgnoreCase("S")) {
                    System.out.print("  Nome do Patrocinador: ");
                    String nomePatrocinador = scanner.nextLine();
                    System.out.print("  Valor do Patrocínio: ");
                    double valor = Double.parseDouble(scanner.nextLine());
                    
                    evento = new EventoPatrocinado(descEvento, dtInicio, dtFim, nomePatrocinador, valor);
                } else {
                    evento = new Evento(descEvento, dtInicio, dtFim);
                }

                boolean continuarPalestra = true;
                while (continuarPalestra) {
                    System.out.println("\n    --- Cadastro de Palestra para o evento " + evento.getDescricao() + " ---");
                    System.out.print("    Tema/Nome da Palestra: ");
                    String nomePalestra = scanner.nextLine();
                    System.out.print("    Data: ");
                    String dataPalestra = scanner.nextLine();
                    System.out.print("    Hora Inicial: ");
                    String horaIni = scanner.nextLine();
                    System.out.print("    Hora Final: ");
                    String horaFim = scanner.nextLine();
                    System.out.print("    Comentário: ");
                    String comentario = scanner.nextLine();

                    Palestra palestra = new Palestra(nomePalestra, dataPalestra, horaIni, horaFim, comentario);
                    
                    evento.adicionarPalestra(palestra);

                    System.out.print("\n    Deseja adicionar outra palestra a este evento? (S/N): ");
                    continuarPalestra = scanner.nextLine().equalsIgnoreCase("S");
                }

                usuario.adicionarEvento(evento);

                System.out.print("\n  Deseja adicionar outro evento para este usuário? (S/N): ");
                continuarEvento = scanner.nextLine().equalsIgnoreCase("S");
            }

            listaUsuarios.add(usuario);

            System.out.print("\nDeseja cadastrar outro usuário no sistema? (S/N): ");
            continuarUsuario = scanner.nextLine().equalsIgnoreCase("S");
        }

        System.out.println("\n\n=============== RELATÓRIO FINAL ===============");
        for (Usuario u : listaUsuarios) {
            System.out.println(u.toString());
        }
        
        scanner.close();
    }
}