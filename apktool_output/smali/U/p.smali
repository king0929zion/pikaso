.class public final enum LU/p;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum d:LU/p;

.field public static final enum e:LU/p;

.field public static final enum f:LU/p;

.field public static final synthetic g:[LU/p;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, LU/p;

    const-string v1, "Active"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, LU/p;->d:LU/p;

    new-instance v1, LU/p;

    const-string v2, "ActiveParent"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, LU/p;->e:LU/p;

    new-instance v2, LU/p;

    const-string v3, "Captured"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v3, LU/p;

    const-string v4, "Inactive"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v3, LU/p;->f:LU/p;

    filled-new-array {v0, v1, v2, v3}, [LU/p;

    move-result-object v0

    sput-object v0, LU/p;->g:[LU/p;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LU/p;
    .locals 1

    const-class v0, LU/p;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LU/p;

    return-object p0
.end method

.method public static values()[LU/p;
    .locals 1

    sget-object v0, LU/p;->g:[LU/p;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LU/p;

    return-object v0
.end method


# virtual methods
.method public final a()Z
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    if-eq v0, v1, :cond_1

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, LB1/c;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    :cond_1
    :goto_0
    const/4 v1, 0x0

    :cond_2
    return v1
.end method
