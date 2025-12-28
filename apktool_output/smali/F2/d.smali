.class public final LF2/d;
.super LF2/g;
.source "SourceFile"


# static fields
.field public static final g:LF2/d;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v6, LF2/d;

    sget v1, LF2/k;->c:I

    sget v2, LF2/k;->d:I

    sget-wide v3, LF2/k;->e:J

    sget-object v5, LF2/k;->a:Ljava/lang/String;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LF2/g;-><init>(IIJLjava/lang/String;)V

    sput-object v6, LF2/d;->g:LF2/d;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Dispatchers.Default cannot be closed"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Dispatchers.Default"

    return-object v0
.end method
