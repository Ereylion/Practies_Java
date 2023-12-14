package Pr_18;

public class Matrix<T> {
    private T[][] data;

    public Matrix(T[][] data) {
        this.data = data;
    }

    public Matrix<T> add(Matrix<T> other) {
        // Проверка размерностей матриц
        if (data.length != other.data.length || data[0].length != other.data[0].length) {
            throw new IllegalArgumentException("Матрицы должны иметь одинаковые размеры для выполнения операции сложения");
        }

        T[][] result = (T[][]) new Object[data.length][data[0].length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                double sum = ((Number) data[i][j]).doubleValue() + ((Number) other.data[i][j]).doubleValue();
                result[i][j] = (T) getDataFromNumber(sum);
            }
        }

        return new Matrix<>(result);
    }

    public Matrix<T> multiply(Matrix<T> other) {
        // Проверка размерностей матриц
        if (data[0].length != other.data.length) {
            throw new IllegalArgumentException("Количество столбцов в первой матрице должно быть равно количеству строк во второй матрице для выполнения операции умножения");
        }

        T[][] result = (T[][]) new Object[data.length][other.data[0].length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < other.data[0].length; j++) {
                double sum = 0;
                for (int k = 0; k < data[0].length; k++) {
                    sum += ((Number) data[i][k]).doubleValue() * ((Number) other.data[k][j]).doubleValue();
                }
                result[i][j] = (T) getDataFromNumber(sum);
            }
        }

        return new Matrix<>(result);
    }

    // Метод для преобразования результата обратно в тип T
    private T getDataFromNumber(double value) {
        if (data[0][0] instanceof Integer) {
            return (T) (Integer) (int) value;
        } else if (data[0][0] instanceof Double) {
            return (T) (Double) value;
        } else {
            throw new UnsupportedOperationException("Тип данных не поддерживается");
        }
    }

    public void print() {
        for (T[] row : data) {
            for (T cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Integer[][] data1 = {{1, 2}, {4, 5}};
        Integer[][] data2 = {{7, 8}, {10, 11}};
        Matrix<Integer> matrix1 = new Matrix<>(data1);
        Matrix<Integer> matrix2 = new Matrix<>(data2);

        System.out.println("Первая матрица:");
        matrix1.print();
        System.out.println("Вторая матрица:");
        matrix2.print();

        System.out.println("Результат сложения:");
        Matrix<Integer> result = matrix1.add(matrix2);
        result.print();

        System.out.println("Результат умножения:");
        Matrix<Integer> resultMultiplication = matrix1.multiply(matrix2);
        resultMultiplication.print();
    }
}