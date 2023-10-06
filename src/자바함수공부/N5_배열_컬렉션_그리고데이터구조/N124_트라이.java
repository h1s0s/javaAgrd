package 자바함수공부.N5_배열_컬렉션_그리고데이터구조;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class N124_트라이 {
    public static void main(String[] args) {
        //트라이(Trie)는 문자열 정렬에서 흔히 쓰이는 순서트리 구조.
        //추출 데이터 구조라는 뜻에서 트라이라는 이름이 붙었다. 이진 트리보다 성능이 뛰어나다.
        //루트를 제외한 트라이의 모든 노드는 문자를 하나씩 포함한다.
        //예를들면 단어가 hey면 노드는 3개다.
        //트라이의 각 노드는 일반적으로 다음을 포함한다
        //값, 자식 노드로의 포인터, 현재 노드가 한단어의 끝임을 뜻하는 true라는 플래그
        //노드 분기에 쓰이는 루트 하나

    }

    public class Node {
        private final Map<Character, Node> children = new HashMap<>();
        private boolean word;

        Map<Character, Node> getChildren() {
            return children;
        }

        public boolean isWord() {
            return word;
        }

        public void setWord(boolean word){
            this.word = word;
        }
    }

    class Tire {
        private final Node root;

        public Tire(Node root) {
            this.root = root;
        }

        public void insert(String word){
            //1. 현재 노드를 루트로 간주한다.
            //2. 주어진 단어를 첫 번째 문자부터 문자 단위로 순회한다.
            //3. 현재 노드가 현재 문자의 값과 일치하면 노드를 따라간다. 그렇지 않으면
            //새 노드를 생성해 현재 문자를 노드에 할당한 후 노드를 따라간다.
            //4. 단어가 끝날 때까지 2단계부터 다시 반복한다(다음 문자로 넘어간다).
            //5. 현재 노드에 단어가 끝났음을 표시한다.
            Node node = root;

            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                Function function = k -> new Node();

                node = node.getChildren().computeIfAbsent(ch, function);
            }

            node.setWord(true);
        }
        public boolean contains(String word) {
            //1. 현재 노드를 루트로 간두한다
            Node node = root;

            //2. 주어진 단어를 문자 단위로 순회한다
            //3. 각 문자가 트라이에 있는지 확인한다
            //4. 문자가 없으면 false를 반환한다
            //5. 단어가 끝날 때까지 2단계부터 다시 반복한다
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                node = node.getChildren().get(ch);

                if (node == null){
                    return false;
                }
            }

            //6. 단어를 모두 순회했을 때 트라이에 있는 단어면 true를, 접두사일 뿐이면
            //false를 반환한다.
            return node.isWord();
        }
//        public boolean delete(String word){
//            //1. 주어진 단어가 트라이에 속하는지 확인한다.
//
//            return null;
//        }
    }
}
