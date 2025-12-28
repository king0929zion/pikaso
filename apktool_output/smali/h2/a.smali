.class public final enum Lh2/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum d:Lh2/a;

.field public static final enum e:Lh2/a;

.field public static final enum f:Lh2/a;

.field public static final synthetic g:[Lh2/a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lh2/a;

    const-string v1, "COROUTINE_SUSPENDED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lh2/a;->d:Lh2/a;

    new-instance v1, Lh2/a;

    const-string v2, "UNDECIDED"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lh2/a;->e:Lh2/a;

    new-instance v2, Lh2/a;

    const-string v3, "RESUMED"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lh2/a;->f:Lh2/a;

    filled-new-array {v0, v1, v2}, [Lh2/a;

    move-result-object v0

    sput-object v0, Lh2/a;->g:[Lh2/a;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lh2/a;
    .locals 1

    const-class v0, Lh2/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lh2/a;

    return-object p0
.end method

.method public static values()[Lh2/a;
    .locals 1

    sget-object v0, Lh2/a;->g:[Lh2/a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lh2/a;

    return-object v0
.end method
