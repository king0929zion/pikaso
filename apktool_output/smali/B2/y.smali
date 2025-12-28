.class public final enum LB2/y;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum d:LB2/y;

.field public static final enum e:LB2/y;

.field public static final enum f:LB2/y;

.field public static final synthetic g:[LB2/y;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, LB2/y;

    const-string v1, "START"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, LB2/y;->d:LB2/y;

    new-instance v1, LB2/y;

    const-string v2, "STOP"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, LB2/y;->e:LB2/y;

    new-instance v2, LB2/y;

    const-string v3, "STOP_AND_RESET_REPLAY_CACHE"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, LB2/y;->f:LB2/y;

    filled-new-array {v0, v1, v2}, [LB2/y;

    move-result-object v0

    sput-object v0, LB2/y;->g:[LB2/y;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LB2/y;
    .locals 1

    const-class v0, LB2/y;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LB2/y;

    return-object p0
.end method

.method public static values()[LB2/y;
    .locals 1

    sget-object v0, LB2/y;->g:[LB2/y;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LB2/y;

    return-object v0
.end method
