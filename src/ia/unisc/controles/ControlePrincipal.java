/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia.unisc.controles;
import java.util.ArrayList;

/**
 *
 * @author Machine
 */
public class ControlePrincipal {

    ADReNA_API.NeuralNetwork.Backpropagation neuralNetwork;

    public void trainingRNA(int camadasIntermediarias, double taxaAprendizado) throws Exception {//Treina a RNA
        neuralNetwork = new ADReNA_API.NeuralNetwork.Backpropagation(18, 3, new int[]{camadasIntermediarias});//Seta o número de neurônios de Entrada, saida, e da camada Intermediaria
        neuralNetwork.SetLearningRate(taxaAprendizado);//Seta a taxa de aprendizado
        neuralNetwork.SetMaxIterationNumber(400);
        ADReNA_API.Data.DataSet diabeteSet = new ADReNA_API.Data.DataSet(18, 3);

        //BAIXO
        diabeteSet.Add(new ADReNA_API.Data.DataSetObject(new double[]{0,/**/ 0, 0, 0,/**/ 0, /**/ 0, 0/**/, 0, 0/**/, 0/**/, 0, 0/**/, 0/**/, 0/**/, 1/**/, 0/**/, 0, 0}, new double[]{0, 0, 0}));//0

//        diabeteSet.Add(new ADReNA_API.Data.DataSetObject(new double[]{1,/**/ 0, 0, 0,/**/ 0, /**/ 0, 0/**/, 0, 0/**/, 0/**/, 0, 0/**/, 0/**/, 0/**/, 1/**/, 0/**/, 0, 0}, new double[]{0, 0, 0}));//1
//        diabeteSet.Add(new ADReNA_API.Data.DataSetObject(new double[]{0,/**/ 0, 0, 0,/**/ 1, /**/ 0, 0/**/, 0, 0/**/, 0/**/, 0, 0/**/, 0/**/, 0/**/, 1/**/, 0/**/, 0, 0}, new double[]{0, 0, 0}));
//
//        diabeteSet.Add(new ADReNA_API.Data.DataSetObject(new double[]{0,/**/ 0, 0, 1,/**/ 0, /**/ 0, 0/**/, 0, 0/**/, 0/**/, 0, 0/**/, 0/**/, 0/**/, 1/**/, 0/**/, 0, 0}, new double[]{0, 0, 0}));//2
//        diabeteSet.Add(new ADReNA_API.Data.DataSetObject(new double[]{0,/**/ 0, 0, 0,/**/ 0, /**/ 0, 0/**/, 0, 0/**/, 0/**/, 0, 0/**/, 1/**/, 0/**/, 1/**/, 0/**/, 0, 0}, new double[]{0, 0, 0}));
//
//        diabeteSet.Add(new ADReNA_API.Data.DataSetObject(new double[]{0,/**/ 0, 1, 0,/**/ 0, /**/ 0, 0/**/, 0, 0/**/, 0/**/, 0, 0/**/, 0/**/, 0/**/, 1/**/, 0/**/, 0, 0}, new double[]{0, 0, 0}));//3
//        diabeteSet.Add(new ADReNA_API.Data.DataSetObject(new double[]{0,/**/ 0, 0, 0,/**/ 0, /**/ 0, 1/**/, 0, 0/**/, 0/**/, 0, 0/**/, 0/**/, 0/**/, 1/**/, 0/**/, 0, 0}, new double[]{0, 0, 0}));
//
//        diabeteSet.Add(new ADReNA_API.Data.DataSetObject(new double[]{0,/**/ 0, 1, 1,/**/ 0, /**/ 0, 0/**/, 0, 0/**/, 0/**/, 0, 0/**/, 0/**/, 0/**/, 1/**/, 0/**/, 0, 0}, new double[]{0, 0, 0}));//4
//        diabeteSet.Add(new ADReNA_API.Data.DataSetObject(new double[]{0,/**/ 0, 0, 0,/**/ 0, /**/ 0, 0/**/, 1, 0/**/, 0/**/, 0, 0/**/, 0/**/, 0/**/, 1/**/, 0/**/, 0, 0}, new double[]{0, 0, 0}));
//
//        diabeteSet.Add(new ADReNA_API.Data.DataSetObject(new double[]{1,/**/ 0, 1, 1,/**/ 0, /**/ 0, 0/**/, 0, 0/**/, 0/**/, 0, 0/**/, 0/**/, 0/**/, 1/**/, 0/**/, 0, 0}, new double[]{0, 0, 0}));//5
//        diabeteSet.Add(new ADReNA_API.Data.DataSetObject(new double[]{1,/**/ 0, 0, 0,/**/ 0, /**/ 0, 0/**/, 1, 0/**/, 0/**/, 0, 0/**/, 0/**/, 0/**/, 1/**/, 0/**/, 0, 0}, new double[]{0, 0, 0}));
//
//        diabeteSet.Add(new ADReNA_API.Data.DataSetObject(new double[]{0,/**/ 0, 1, 1,/**/ 0, /**/ 0, 0/**/, 0, 0/**/, 0/**/, 0, 0/**/, 0/**/, 0/**/, 0/**/, 0/**/, 0, 0}, new double[]{0, 0, 0}));//6
//        diabeteSet.Add(new ADReNA_API.Data.DataSetObject(new double[]{0,/**/ 0, 0, 0,/**/ 0, /**/ 0, 0/**/, 1, 0/**/, 0/**/, 0, 0/**/, 0/**/, 0/**/, 0/**/, 0/**/, 0, 0}, new double[]{0, 0, 0}));
        //POUCO ELEVADO
        diabeteSet.Add(new ADReNA_API.Data.DataSetObject(new double[]{1,/**/ 0, 1, 1,/**/ 0, /**/ 0, 0/**/, 0, 0/**/, 0/**/, 0, 0/**/, 0/**/, 0/**/, 0/**/, 0/**/, 0, 0}, new double[]{0, 0, 1}));//7
//        diabeteSet.Add(new ADReNA_API.Data.DataSetObject(new double[]{1,/**/ 0, 0, 0,/**/ 0, /**/ 0, 0/**/, 1, 0/**/, 0/**/, 0, 0/**/, 0/**/, 0/**/, 0/**/, 0/**/, 0, 0}, new double[]{0, 0, 1}));
//
//        diabeteSet.Add(new ADReNA_API.Data.DataSetObject(new double[]{1,/**/ 0, 1, 1,/**/ 0, /**/ 0, 0/**/, 0, 0/**/, 0/**/, 0, 0/**/, 0/**/, 0/**/, 0/**/, 1/**/, 0, 0}, new double[]{0, 0, 1}));//8
//        diabeteSet.Add(new ADReNA_API.Data.DataSetObject(new double[]{1,/**/ 0, 0, 0,/**/ 0, /**/ 0, 0/**/, 1, 0/**/, 0/**/, 0, 0/**/, 0/**/, 0/**/, 0/**/, 1/**/, 0, 0}, new double[]{0, 0, 1}));
//
//        diabeteSet.Add(new ADReNA_API.Data.DataSetObject(new double[]{1,/**/ 0, 1, 1,/**/ 0, /**/ 0, 0/**/, 0, 0/**/, 1/**/, 0, 0/**/, 0/**/, 0/**/, 0/**/, 1/**/, 0, 0}, new double[]{0, 0, 1}));//9
//        diabeteSet.Add(new ADReNA_API.Data.DataSetObject(new double[]{1,/**/ 0, 0, 0,/**/ 0, /**/ 0, 0/**/, 1, 0/**/, 1/**/, 0, 0/**/, 0/**/, 0/**/, 1/**/, 1/**/, 0, 0}, new double[]{0, 0, 1}));
//
//        diabeteSet.Add(new ADReNA_API.Data.DataSetObject(new double[]{0,/**/ 0, 1, 1,/**/ 0, /**/ 0, 0/**/, 0, 0/**/, 0/**/, 0, 0/**/, 0/**/, 0/**/, 0/**/, 0/**/, 1, 0}, new double[]{0, 0, 1}));//10
//        diabeteSet.Add(new ADReNA_API.Data.DataSetObject(new double[]{0,/**/ 0, 0, 0,/**/ 0, /**/ 0, 0/**/, 1, 0/**/, 0/**/, 0, 0/**/, 0/**/, 0/**/, 0/**/, 0/**/, 1, 0}, new double[]{0, 0, 1}));
//
//        diabeteSet.Add(new ADReNA_API.Data.DataSetObject(new double[]{1,/**/ 0, 1, 1,/**/ 0, /**/ 0, 0/**/, 0, 0/**/, 0/**/, 0, 0/**/, 0/**/, 0/**/, 1/**/, 1/**/, 1, 0}, new double[]{0, 0, 1}));//11
//        diabeteSet.Add(new ADReNA_API.Data.DataSetObject(new double[]{1,/**/ 0, 0, 0,/**/ 0, /**/ 0, 0/**/, 1, 0/**/, 0/**/, 0, 0/**/, 0/**/, 0/**/, 1/**/, 1/**/, 1, 0}, new double[]{0, 0, 1}));

        //MODERADO
        diabeteSet.Add(new ADReNA_API.Data.DataSetObject(new double[]{1,/**/ 0, 1, 1,/**/ 0, /**/ 0, 0/**/, 0, 0/**/, 0/**/, 0, 0/**/, 0/**/, 0/**/, 0/**/, 1/**/, 1, 0}, new double[]{0, 1, 0}));//12
//        diabeteSet.Add(new ADReNA_API.Data.DataSetObject(new double[]{1,/**/ 0, 0, 0,/**/ 0, /**/ 0, 0/**/, 1, 0/**/, 0/**/, 0, 0/**/, 0/**/, 0/**/, 0/**/, 1/**/, 1, 0}, new double[]{0, 1, 0}));
//
//        diabeteSet.Add(new ADReNA_API.Data.DataSetObject(new double[]{0,/**/ 0, 1, 1,/**/ 0, /**/ 1, 0/**/, 0, 0/**/, 0/**/, 1, 0/**/, 0/**/, 0/**/, 1/**/, 1/**/, 0, 0}, new double[]{0, 1, 0}));//13
//        diabeteSet.Add(new ADReNA_API.Data.DataSetObject(new double[]{0,/**/ 0, 0, 0,/**/ 0, /**/ 1, 0/**/, 1, 0/**/, 0/**/, 1, 0/**/, 0/**/, 0/**/, 1/**/, 1/**/, 0, 0}, new double[]{0, 1, 0}));
//
//        diabeteSet.Add(new ADReNA_API.Data.DataSetObject(new double[]{1,/**/ 0, 1, 1,/**/ 0, /**/ 1, 0/**/, 0, 0/**/, 0/**/, 0, 0/**/, 0/**/, 0/**/, 1/**/, 0/**/, 1, 0}, new double[]{0, 1, 0}));//14       
//        diabeteSet.Add(new ADReNA_API.Data.DataSetObject(new double[]{1,/**/ 0, 0, 0,/**/ 0, /**/ 1, 0/**/, 1, 0/**/, 0/**/, 0, 0/**/, 0/**/, 0/**/, 1/**/, 0/**/, 1, 0}, new double[]{0, 1, 0}));

        //ALTO
        diabeteSet.Add(new ADReNA_API.Data.DataSetObject(new double[]{1,/**/ 0, 1, 1,/**/ 0, /**/ 1, 0/**/, 0, 0/**/, 0/**/, 0, 0/**/, 0/**/, 0/**/, 1/**/, 1/**/, 1, 0}, new double[]{0, 1, 1}));//15
//        diabeteSet.Add(new ADReNA_API.Data.DataSetObject(new double[]{1,/**/ 0, 0, 0,/**/ 0, /**/ 1, 0/**/, 1, 0/**/, 0/**/, 0, 0/**/, 0/**/, 0/**/, 1/**/, 1/**/, 1, 0}, new double[]{0, 1, 1}));
//
//        diabeteSet.Add(new ADReNA_API.Data.DataSetObject(new double[]{0,/**/ 0, 1, 1,/**/ 0, /**/ 1, 0/**/, 0, 0/**/, 0/**/, 0, 0/**/, 0/**/, 0/**/, 0/**/, 1/**/, 1, 0}, new double[]{0, 1, 1}));//16
//        diabeteSet.Add(new ADReNA_API.Data.DataSetObject(new double[]{0,/**/ 0, 0, 0,/**/ 0, /**/ 1, 0/**/, 1, 0/**/, 0/**/, 0, 0/**/, 0/**/, 0/**/, 0/**/, 1/**/, 1, 0}, new double[]{0, 1, 1}));
//
//        diabeteSet.Add(new ADReNA_API.Data.DataSetObject(new double[]{1,/**/ 0, 1, 1,/**/ 0, /**/ 1, 0/**/, 0, 0/**/, 0/**/, 1, 0/**/, 0/**/, 0/**/, 1/**/, 0/**/, 1, 0}, new double[]{0, 1, 1}));//17
//        diabeteSet.Add(new ADReNA_API.Data.DataSetObject(new double[]{1,/**/ 0, 0, 0,/**/ 0, /**/ 1, 0/**/, 1, 0/**/, 0/**/, 1, 0/**/, 0/**/, 0/**/, 1/**/, 0/**/, 1, 0}, new double[]{0, 1, 1}));
//
//        diabeteSet.Add(new ADReNA_API.Data.DataSetObject(new double[]{1,/**/ 0, 1, 1,/**/ 0, /**/ 1, 0/**/, 0, 0/**/, 0/**/, 1, 0/**/, 0/**/, 0/**/, 1/**/, 1/**/, 1, 0}, new double[]{0, 1, 1}));//18
//        diabeteSet.Add(new ADReNA_API.Data.DataSetObject(new double[]{0,/**/ 0, 0, 0,/**/ 0, /**/ 1, 0/**/, 1, 0/**/, 0/**/, 1, 0/**/, 0/**/, 0/**/, 1/**/, 1/**/, 1, 0}, new double[]{0, 1, 1}));
//
//        diabeteSet.Add(new ADReNA_API.Data.DataSetObject(new double[]{1,/**/ 0, 1, 1,/**/ 0, /**/ 1, 0/**/, 0, 0/**/, 0/**/, 1, 0/**/, 0/**/, 0/**/, 0/**/, 0/**/, 1, 0}, new double[]{0, 1, 1}));//19
//        diabeteSet.Add(new ADReNA_API.Data.DataSetObject(new double[]{1,/**/ 0, 0, 0,/**/ 0, /**/ 1, 0/**/, 1, 0/**/, 0/**/, 1, 0/**/, 0/**/, 0/**/, 0/**/, 0/**/, 1, 0}, new double[]{0, 1, 1}));
//
//        diabeteSet.Add(new ADReNA_API.Data.DataSetObject(new double[]{1,/**/ 0, 1, 1,/**/ 0, /**/ 1, 0/**/, 0, 0/**/, 0/**/, 1, 0/**/, 0/**/, 0/**/, 0/**/, 1/**/, 1, 0}, new double[]{0, 1, 1}));//20
//        diabeteSet.Add(new ADReNA_API.Data.DataSetObject(new double[]{1,/**/ 0, 0, 0,/**/ 0, /**/ 1, 0/**/, 1, 0/**/, 0/**/, 1, 0/**/, 0/**/, 0/**/, 0/**/, 1/**/, 1, 0}, new double[]{0, 1, 1}));

        //MUITO ALTO
        diabeteSet.Add(new ADReNA_API.Data.DataSetObject(new double[]{1,/**/ 0, 1, 1,/**/ 0, /**/ 1, 0/**/, 0, 0/**/, 1/**/, 1, 0/**/, 0/**/, 0/**/, 0/**/, 1/**/, 1, 0}, new double[]{1, 0, 0}));//21
//        diabeteSet.Add(new ADReNA_API.Data.DataSetObject(new double[]{1,/**/ 0, 0, 0,/**/ 0, /**/ 1, 0/**/, 1, 0/**/, 1/**/, 1, 0/**/, 0/**/, 0/**/, 0/**/, 1/**/, 1, 0}, new double[]{1, 0, 0}));
//
//        diabeteSet.Add(new ADReNA_API.Data.DataSetObject(new double[]{1,/**/ 0, 1, 1,/**/ 0, /**/ 1, 0/**/, 0, 0/**/, 1/**/, 1, 0/**/, 0/**/, 1/**/, 0/**/, 0/**/, 1, 0}, new double[]{1, 0, 0}));//22
//        diabeteSet.Add(new ADReNA_API.Data.DataSetObject(new double[]{1,/**/ 0, 0, 0,/**/ 0, /**/ 1, 0/**/, 1, 0/**/, 1/**/, 1, 0/**/, 0/**/, 1/**/, 0/**/, 0/**/, 1, 0}, new double[]{1, 0, 0}));
//
//        diabeteSet.Add(new ADReNA_API.Data.DataSetObject(new double[]{1,/**/ 0, 1, 1,/**/ 0, /**/ 1, 0/**/, 0, 0/**/, 1/**/, 1, 0/**/, 0/**/, 1/**/, 0/**/, 1/**/, 1, 0}, new double[]{1, 0, 0}));//23
//        diabeteSet.Add(new ADReNA_API.Data.DataSetObject(new double[]{1,/**/ 0, 0, 0,/**/ 0, /**/ 1, 0/**/, 1, 0/**/, 1/**/, 1, 0/**/, 0/**/, 1/**/, 0/**/, 1/**/, 1, 0}, new double[]{1, 0, 0}));

        neuralNetwork.Learn(diabeteSet);
    }

    public double[] processingInput(String entradasTela) throws Exception {

        double[] resposta = null;

        String[] Sentradas = entradasTela.split(",");
        double[] entradas = new double[Sentradas.length];

        for (int i = 0; i < Sentradas.length; i++) {
            entradas[i] = Double.parseDouble(Sentradas[i]);
        }

        resposta = neuralNetwork.Recognize(entradas);//Pega a resposta do Adrena
        return resposta;
    }

    public String criptografaSaida(double[] saida) {//Retorna a saída criptografada em STRING
        String resposta = "";
        double neuronio1 = Math.round(saida[0]);
        double neuronio2 = Math.round(saida[1]);
        double neuronio3 = Math.round(saida[2]);

        if (neuronio1 == 0 && neuronio2 == 0 && neuronio3 == 0) {
            resposta = "Baixo";
        } else if (neuronio1 == 0 && neuronio2 == 0 && neuronio3 == 1) {
            resposta = "Pouco Elevado";
        } else if (neuronio1 == 0 && neuronio2 == 1 && neuronio3 == 0) {
            resposta = "Moderado";
        } else if (neuronio1 == 0 && neuronio2 == 1 && neuronio3 == 1) {
            resposta = "Alto";
        } else if (neuronio1 == 1 && neuronio2 == 0 && neuronio3 == 0) {
            resposta = "Muito Alto";
        }

        return resposta;
    }

    public ArrayList<String> getInformationAboutSearch() {//Pega as informações do adrena(Taxa de erro, Número de iterações, Número máximo de iterações)
        ArrayList<String> informacoes = new ArrayList();

        informacoes.add(String.valueOf(neuralNetwork.GetErrorRate()));
        informacoes.add(String.valueOf(neuralNetwork.GetIterationNumber()));
        informacoes.add(String.valueOf(neuralNetwork.GetMaxIterationNumber()));
        informacoes.add(String.valueOf(neuralNetwork.GetLearningRate()));

        return informacoes;
    }
}
