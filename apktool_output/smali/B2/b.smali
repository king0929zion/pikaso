.class public final LB2/b;
.super Li2/c;
.source "SourceFile"


# instance fields
.field public synthetic g:Ljava/lang/Object;

.field public final synthetic h:LB2/c;

.field public i:I


# direct methods
.method public constructor <init>(LB2/c;Lg2/d;)V
    .locals 0

    iput-object p1, p0, LB2/b;->h:LB2/c;

    invoke-direct {p0, p2}, Li2/c;-><init>(Lg2/d;)V

    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, LB2/b;->g:Ljava/lang/Object;

    iget p1, p0, LB2/b;->i:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LB2/b;->i:I

    iget-object p1, p0, LB2/b;->h:LB2/c;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, LB2/c;->b(Ljava/lang/Object;Lg2/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
