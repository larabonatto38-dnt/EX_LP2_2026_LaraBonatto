import java.util.Scanner;

/*
Exercício 4: Sistema de Registro de Pacientes em Hospital
Você precisa modelar um sistema de registro de pacientes para um hospital. Identifique
as classes conceituais, seus atributos e associações considerando: Pacientes são
internados em quartos. Para cada paciente internado há um médico responsável.
Durante o período de internamento o médico responsável define os medicamentos e
horários que devem ser administrados. A pessoa responsável pela administração dos
medicamentos é a enfermeira.
*/

/*
Enfermeira - cuida da prescricao que foi feita
Internacao - tem o quarto
Medicamento - ta dentro da prescricao
Medico - prescreve os medicamentos
Paciente - tem um medico responsavel
prescricaoMedica - medicamentos prescrevidos e enfermeira responsavel
Quarto - tem um paciente dentro
*/

public class Teste04 {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        imprimir("\n...:::Sistema de Registro de Pacientes em Hospital:::...\n");
        
        //objeto enfermeira04
        Enfermeira enfermeira04 = new Enfermeira();
        enfermeira04.setIdEnfermeira(444);
        enfermeira04.setNome("Ana");

        //objeto internacao04
        Internacao internacao04 = new Internacao();
        internacao04.setIdInternacao(0404);
        internacao04.setDataEntrada(21022020);
        internacao04.setDataSaida(28022020);
        internacao04.setDiagnosticoGeral("Suspeita de pneumonia aguda");

        //objeto medicamento04
        Medicamento medicamento04 = new Medicamento();
        medicamento04.setIdMedicamento(44440);
        medicamento04.setNomeMedicamento("Cloro fosforilado");
        medicamento04.setDosagem(2);
        medicamento04.setInstrucoes("Tomar de 12 em 12 horas, proibido para gestantes.");

        //objeto medico04
        Medico medico04 = new Medico();
        medico04.setIdMedico(3434);
        medico04.setNome("Francisco");
        medico04.setEspecialidade("Medico Geral");

        //objeto paciente04
        Paciente paciente04 = new Paciente();
        paciente04.setIdPaciente(1234);
        paciente04.setNome("José");
        paciente04.setSobrenome("de Paula");
        paciente04.setCpf(123456789);
        paciente04.setDataNascimento(22091987);
        paciente04.setTelefone(98765432);

        //objeto prescricaoMedica04
        prescricaoMedica prescricaoMedica04 = new prescricaoMedica();
        prescricaoMedica04.setIdPrescricao(12344);
        prescricaoMedica04.setDataPrescricao(19082010);
        prescricaoMedica04.setHoraPrescricao(12);

        //objeto quarto04
        Quarto quarto04 = new Quarto();
        quarto04.setNumeroQuarto(404);
        quarto04.setAndar(4);
        quarto04.setTipo("UTI");
        quarto04.setStatus("Ocupado");


        // setar quarto da internacao
        internacao04.setQuarto(quarto04);

        // setar prescricao medica
        medico04.setPrescricaoFeita(prescricaoMedica04);

        // setar medico responsavel
        paciente04.setMedicoResponsavel(medico04);

        // setar medicamento prescrito
        prescricaoMedica04.setMedicamentoPrescrito(medicamento04);

        // setar enfermeira que administra
        prescricaoMedica04.setEnfermeiraQueAdministra(enfermeira04);

        // setar paciente internado
        quarto04.setPacienteInternado(paciente04);

        
        imprimir("...::TESTES::...\n");
        imprimir(" ");
        imprimir(enfermeira04.toString());
        imprimir(" ");
        imprimir(internacao04.toString());
        imprimir(" ");
        imprimir(medicamento04.toString());
        imprimir(" ");
        imprimir(medico04.toString());
        imprimir(" ");
        imprimir(paciente04.toString());
        imprimir(" ");
        imprimir(prescricaoMedica04.toString());
        imprimir(" ");
        imprimir(quarto04.toString());
    }

    public static void imprimir(String text) {
        System.out.println(text);
    }
}