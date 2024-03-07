package utilities;

import java.util.*;

//A classe SearchSystem representa o sistema de pesquisa e mantém uma lista de todas as pesquisas realizadas.
public class SearchSystem {
    private List<Search> searches;

    public SearchSystem() {
        this.searches = new ArrayList<>();
    }
    // Método para adicionar uma nova pesquisa à lista.
    public void addSearch(String origin, String destination, Date startDate, Date endDate, Date searchDateTime,
                          Date checkInDate, Date checkOutDate) {
        searches.add(new Search(origin, destination, startDate, endDate, searchDateTime, checkInDate, checkOutDate));

    }

    // Classe Search representa uma pesquisa realizada por um cliente.
    static class Search {
        private String origin;
        private String destination;
        private Date startDate;
        private Date endDate;
        private Date searchDateTime;
        private Date checkInDate;
        private Date checkOutDate;

        public Search(String origin, String destination, Date startDate, Date endDate, Date searchDateTime,
                      Date checkInDate, Date checkOutDate) {
            this.origin = origin;
            this.destination = destination;
            this.startDate = startDate;
            this.endDate = endDate;
            this.searchDateTime = searchDateTime;
            this.checkInDate = checkInDate;
            this.checkOutDate = checkOutDate;
        }

        public String getOrigin() {
            return origin;
        }

        public String getDestination() {
            return destination;
        }

        public Date getStartDate() {
            return startDate;
        }

        public Date getEndDate() {
            return endDate;
        }

        public Date getSearchDateTime() {
            return searchDateTime;
        }

        public Date getCheckInDate() {
            return checkInDate;
        }

        public Date getCheckOutDate() {
            return checkOutDate;
        }
    }

    /*    public List<String> getTopDestinations(int n) {
        Map<String, Integer> destinationCounts = new HashMap<>();
        for (Search search : searches) {
            destinationCounts.put(search.getDestination(), destinationCounts.getOrDefault(search.getDestination(), 0) + 1);
        }
        List<Map.Entry<String, Integer>> sortedDestinations = new ArrayList<>(destinationCounts.entrySet());
        sortedDestinations.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        List<String> topDestinations = new ArrayList<>();
        for (int i = 0; i < Math.min(n, sortedDestinations.size()); i++) {
            topDestinations.add(sortedDestinations.get(i).getKey());
        }
        return topDestinations;
    }

    public List<Date> getPopularDates() {
        Map<Date, Integer> dateCounts = new HashMap<>();
        for (Search search : searches) {
            Date startDate = search.getStartDate();
            if (!dateCounts.containsKey(startDate)) {
                dateCounts.put(startDate, 0);
            }
            dateCounts.put(startDate, dateCounts.get(startDate) + 1);

            Date endDate = search.getEndDate();
            if (!dateCounts.containsKey(endDate)) {
                dateCounts.put(endDate, 0);
            }
            dateCounts.put(endDate, dateCounts.get(endDate) + 1);
        }
        List<Map.Entry<Date, Integer>> sortedDates = new ArrayList<>(dateCounts.entrySet());
        sortedDates.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        List<Date> popularDates = new ArrayList<>();
        for (int i = 0; i < Math.min(5, sortedDates.size()); i++) {
            popularDates.add(sortedDates.get(i).getKey());
        }
        return popularDates;
    }*/
}




