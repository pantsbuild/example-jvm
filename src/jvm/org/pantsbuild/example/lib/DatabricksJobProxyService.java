package org.pantsbuild.example.lib;

import io.grpc.stub.StreamObserver;
import javax.annotation.Nonnull;
import org.pantsbuild.example.*;

public final class DatabricksJobProxyService extends DatabricksJobProxyServiceGrpc.DatabricksJobProxyServiceImplBase {


    /**
     * Submits pynest job request.
     */
    @Override
    public void submitPynestJob(SubmitPynestJobRequest request, StreamObserver<SubmitJobResponse> responseObserver) {
        throw new UnsupportedOperationException("submitPynestJob");
    }

    /**
     * Submits a raw job request
     */
    @Override
    public void submitRawJob(SubmitRawJobRequest request, StreamObserver<SubmitJobResponse> responseObserver) {
        throw new UnsupportedOperationException("submitRawJob");
    }

    /**
     * Gets a job status.
     */
    @Override
    public void getJobState(GetJobStateRequest request, StreamObserver<GetJobStateResponse> responseObserver) {
        throw new UnsupportedOperationException("getJobState");
    }

    /**
     * Cancels a run.
     */
    @Override
    public void cancelRun(CancelRunRequest request, StreamObserver<CancelRunResponse> responseObserver) {
        throw new UnsupportedOperationException("cancelRun");
    }

    /**
     * Queries a job.
     */
    @Override
    public void queryJob(QueryJobRequest request, StreamObserver<QueryJobResponse> responseObserver) {
        throw new UnsupportedOperationException("queryJob");
    }

    /**
     * Deletes a job.
     */
    @Override
    public void deleteJob(DeleteJobRequest request, StreamObserver<DeleteJobResponse> responseObserver) {
        throw new UnsupportedOperationException("deleteJob");
    }

    /**
     * List all active job runs.
     */
    @Override
    public void listAllActiveJobRuns(ListAllActiveJobRunsRequest request, StreamObserver<ListAllActiveJobRunsResponse> responseObserver) {
        throw new UnsupportedOperationException("listAllActiveJobRuns");
    }
}
