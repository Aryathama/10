# ATM Service Route Optimization (Traveling Salesperson Problem) 🗺️

## Project Overview

This project aims to optimize ATM service routes using computational algorithms to solve the Traveling Salesperson Problem (TSP). The primary goal is to minimize the total travel distance for servicing a network of ATMs, specifically focusing on BCA ATMs. The project explores both clustered and non-clustered approaches, employing Genetic Algorithms (GA) 🧬 and a Nearest Neighbor (NN) + 2-Opt algorithm 🛣️ for route optimization.

## Features ✨

  * **Data Loading and Preprocessing**: Loads ATM location data (Longitude, Latitude) from an Excel file 📊 and converts coordinates to decimal degrees.
  * **K-Means Clustering**: Groups ATM locations into clusters 📍 to simplify the TSP for larger datasets.
  * **Haversine Distance Calculation**: Calculates accurate distances between ATM locations using the Haversine formula 📏, considering the Earth's curvature.
  * **Genetic Algorithm (GA)**: Implements a GA to find near-optimal solutions for the TSP. This includes:
      * Route creation (initial population generation) 🔄.
      * Crossover operation (combining parent routes) 🤝.
      * Mutation operation (introducing genetic diversity) 💥.
      * Fitness evaluation (calculating route distance) 🏃.
  * **Nearest Neighbor (NN) + 2-Opt Algorithm**: Provides a heuristic approach to the TSP, where:
      * Nearest Neighbor constructs an initial route ➡️.
      * 2-Opt local search improves the route by swapping edges 🔄.
  * **Comparison of Approaches**: Compares the total distances and route visualizations of different strategies:
      * Clustered GA 🧩
      * Clustered NN + 2-Opt 🗺️
      * Non-clustered GA (with fixed start) 🎯
      * Non-clustered NN + 2-Opt (with fixed start) 📍
  * **Visualization**:
      * Matplotlib plots of ATM clusters and optimized routes 📈.
      * Folium interactive maps displaying ATM locations, the depot 🏠, and the optimized service routes for each cluster 🗺️.
  * **Results Export**: Exports optimized routes and their total distances to an Excel file 💾.

## Algorithms Used 🤖

  * **K-Means Clustering**: An unsupervised machine learning algorithm used for partitioning `n` observations into `k` clusters.
  * **Haversine Formula**: Calculates the great-circle distance between two points on a sphere (e.g., Earth) given their longitudes and latitudes.
  * **Genetic Algorithm (GA)**: A metaheuristic inspired by the process of natural selection, used to find approximate solutions to optimization and search problems.
  * **Nearest Neighbor (NN)**: A greedy algorithm for TSP that builds a route by always visiting the nearest unvisited city.
  * **2-Opt**: A local search algorithm used to improve existing TSP tours by repeatedly removing two edges and replacing them with two different edges that reconnect the fragments into a shorter tour.

## Dataset 📁

The project uses a dataset named `Dataset SC ATM BCA.xlsx` which contains the following columns:

  * `id`
  * `Nama ATM BCA` (Name of BCA ATM)
  * `Longitude`
  * `Latitude`

Note: The Longitude and Latitude values in the dataset are divided by `1e6` during preprocessing to convert them into decimal degrees.

## Getting Started 🚀

### Prerequisites

  * Python 3.x 🐍
  * Jupyter Notebook or JupyterLab 📝

### Installation

1.  Clone this repository:

    ```bash
    git clone https://github.com/Aryathama/TSP-ATM-Machine.git
    cd TSP-ATM-Machine
    ```

2.  Install the required Python packages:

    ```bash
    pip install pandas openpyxl scikit-learn matplotlib numpy folium
    ```

### Usage

1.  Place your `Dataset SC ATM BCA.xlsx` file in the project's root directory.
2.  Open the Jupyter Notebook:
    ```bash
    jupyter notebook "TSP ATM BCA.ipynb"
    ```
3.  Run all cells in the notebook. ▶️

The notebook will perform the following steps:

  * Load the ATM data.
  * Preprocess the `Longitude` and `Latitude` columns.
  * Apply K-Means clustering to group ATMs.
  * Visualize the clustered data.
  * Implement and run the Genetic Algorithm and NN + 2-Opt for both clustered and non-clustered scenarios.
  * Display route visualizations and total distances.
  * Export the results to an Excel file (if applicable).

## Project Structure 🏗️

```
TSP-ATM-Machine/
├── Dataset SC ATM BCA.xlsx # Your dataset file 📊
├── TSP ATM BCA.ipynb     # Jupyter Notebook with the main code 🧑‍💻
└── README.md             # This file! 📄
```
