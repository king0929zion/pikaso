.class public final LD/F0;
.super LN/A;
.source "SourceFile"


# instance fields
.field public c:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, LN/A;-><init>()V

    iput p1, p0, LD/F0;->c:I

    return-void
.end method


# virtual methods
.method public final a(LN/A;)V
    .locals 1

    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord"

    invoke-static {p1, v0}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LD/F0;

    iget p1, p1, LD/F0;->c:I

    iput p1, p0, LD/F0;->c:I

    return-void
.end method

.method public final b()LN/A;
    .locals 2

    new-instance v0, LD/F0;

    iget v1, p0, LD/F0;->c:I

    invoke-direct {v0, v1}, LD/F0;-><init>(I)V

    return-object v0
.end method
