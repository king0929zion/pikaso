.class public final LB2/m;
.super Li2/c;
.source "SourceFile"


# instance fields
.field public g:LB2/n;

.field public synthetic h:Ljava/lang/Object;

.field public i:I

.field public final synthetic j:LB2/n;

.field public k:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LB2/n;Lg2/d;)V
    .locals 0

    iput-object p1, p0, LB2/m;->j:LB2/n;

    invoke-direct {p0, p2}, Li2/c;-><init>(Lg2/d;)V

    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, LB2/m;->h:Ljava/lang/Object;

    iget p1, p0, LB2/m;->i:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LB2/m;->i:I

    iget-object p1, p0, LB2/m;->j:LB2/n;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, LB2/n;->b(Ljava/lang/Object;Lg2/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
