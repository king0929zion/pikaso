.class public final enum Lh0/g;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum d:Lh0/g;

.field public static final enum e:Lh0/g;

.field public static final enum f:Lh0/g;

.field public static final synthetic g:[Lh0/g;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lh0/g;

    const-string v1, "Initial"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lh0/g;->d:Lh0/g;

    new-instance v1, Lh0/g;

    const-string v2, "Main"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lh0/g;->e:Lh0/g;

    new-instance v2, Lh0/g;

    const-string v3, "Final"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lh0/g;->f:Lh0/g;

    filled-new-array {v0, v1, v2}, [Lh0/g;

    move-result-object v0

    sput-object v0, Lh0/g;->g:[Lh0/g;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lh0/g;
    .locals 1

    const-class v0, Lh0/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lh0/g;

    return-object p0
.end method

.method public static values()[Lh0/g;
    .locals 1

    sget-object v0, Lh0/g;->g:[Lh0/g;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lh0/g;

    return-object v0
.end method
