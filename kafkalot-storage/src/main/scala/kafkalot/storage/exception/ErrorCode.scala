package kafkalot.storage.exception

object ErrorCode {
  val CONNECTOR_NAME_DUPLICATED = "CONNECTOR_NAME_DUPLICATED"
  val CANNOT_UPDATE_META_USING_PUT_API = "CANNOT_UPDATE_META_USING_PUT_API"
  val CANNOT_CREATE_RUNNING_CONNECTOR = "CANNOT_CREATE_RUNNING_CONNECTOR"
  val CANNOT_UPDATE_RUNNING_CONNECTOR_CONFIG = "CANNOT_UPDATE_RUNNING_CONNECTOR_CONFIG"
  val CANNOT_UPDATE_DISABLED_CONNECTOR_CONFIG = "CANNOT_UPDATE_DISABLED_CONNECTOR_CONFIG"
  val FAILED_TO_STOP_CONNECTOR = "FAILED_TO_STOP_CONNECTOR"
  val FAILED_TO_START_CONNECTOR = "FAILED_TO_START_CONNECTOR"
  val FAILED_TO_RESTART_CONNECTOR = "FAILED_TO_RESTART_CONNECTOR"
  val FAILED_TO_PAUSE_CONNECTOR = "FAILED_TO_PAUSE_CONNECTOR"
  val FAILED_TO_RESUME_CONNECTOR = "FAILED_TO_RESUME_CONNECTOR"
  val FAILED_TO_GET_CONNECTOR = "FAILED_TO_GET_CONNECTOR"
  val FAILED_TO_GET_CONNECTOR_STATUS = "FAILED_TO_GET_CONNECTOR_STATUS"
  val FAILED_TO_GET_CONNECTORS = "FAILED_TO_GET_CONNECTORS"
  val FAILED_TO_DELETE_CONNECTOR = "FAILED_TO_DELETE_CONNECTOR"
  val FAILED_TO_UPDATE_CONNECTOR_CONFIG = "FAILED_TO_UPDATE_CONNECTOR_CONFIG"
  val INVALID_CONNECTOR_COMMAND_OPERATION = "INVALID_CONNECTOR_COMMAND_OPERATION"
  val UNSUPPORTED_CONNECTOR_OPERATION = "UNSUPPORTED_CONNECTOR_OPERATION"
  val CANNOT_DELETE_NOT_REGISTERED_CONNECTOR = "CANNOT_DELETE_NOT_REGISTERED_CONNECTOR"
  val CANNOT_DELETE_UNKNOWN_CONNECTOR = "CANNOT_DELETE_UNKNOWN_CONNECTOR"

  /** utils */
  val FAILED_TO_PARSE_JSON_OBJECT = "FAILED_TO_PARSE_JSON_OBJECT"

  /** model */
  val STORAGE_CONNECTOR_ALREADY_EXISTS = "STORAGE_CONNECTOR_ALREADY_EXISTS"
  val STORAGE_CONNECTOR_DOES_NOT_EXIST = "STORAGE_CONNECTOR_DOES_NOT_EXIST"
}